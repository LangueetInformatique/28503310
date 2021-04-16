# Définition d'un client réseau gérant en parallèle l'émission
# et la réception des messages (utilisation de 2 THREADS).

import socket, sys, threading
import time
#HOST = '127.0.0.1' 
HOST = socket.gethostbyname(socket.gethostname())
PORT = 50000
 

 
class ThreadReception(threading.Thread):
  """Objet thread gérant la réception des messages"""
  def __init__(self, conn):
    threading.Thread.__init__(self)
    self.running = None
    self.connexion = conn      # réf. du socket de connexion
 
  def terminate(self):
    self.running = False

  def run(self):
    self.running = True

    while self.running:
      message_recu = self.connexion.recv(1024).decode("Utf8")
      print("[TR] {}".format(message_recu))

      #if not message_recu:
      if not message_recu:
        self.terminate()

    # Le thread <réception> se termine ici.
    print("ThreadReception arrêté. Connexion interrompue.")
    #self.connexion.close()
 
class ThreadEmission(threading.Thread):
  """objet thread gérant l'émission des messages"""
  def __init__(self, conn):
    threading.Thread.__init__(self)
    self.running = None
    self.connexion = conn      # réf. du socket de connexion

  def terminate(self):
    self.running = False

  def run(self):
    self.running = True

    while self.running:
      message_emis = input("[TE] Vous > ")
      self.connexion.sendall(message_emis.encode("Utf8"))

      if message_emis.upper() == "FIN":        
        self.terminate()

    # Le thread <emission> se termine ici.
    print("ThreadEmission arrêté. Connexion interrompue.")
    #self.connexion.close()

def main():

  # Programme principal - Établissement de la connexion :
  # 1) création du socket 
  connexion = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

  try:
    connexion.connect((HOST, PORT))
  except socket.error:
    print("La connexion a échoué.")
    sys.exit()

  print("Connexion établie avec le serveur.")
   
  # Dialogue avec le serveur : on lance deux threads pour gérer
  # indépendamment l'émission et la réception des messages :
  th_R = ThreadReception(connexion)
  th_E = ThreadEmission(connexion)
  th_R.start()
  time.sleep(0.5)
  th_E.start()

  th_R.join()
  th_E.join()
  print("Tous les threads ont fini. Fermeture de la connexion...")  
  connexion.close()
if __name__ == '__main__':
  """
  Starts the whole app from the command line
  """

  main()