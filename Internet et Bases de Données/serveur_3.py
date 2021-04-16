# Définition d'un serveur réseau gérant un système de CHAT simplifié.
# Utilise les threads pour gérer les connexions clientes en parallèle.

import socket, sys, threading 
import re

#HOST = '127.0.0.1' 
HOST = socket.gethostbyname(socket.gethostname())
PORT = 50000
conn_clients = dict()  # dictionnaire des connexions clients

class ThreadClient(threading.Thread):
  """dérivation d'un objet thread pour gérer la connexion avec un client"""
  def __init__(self, conn):
    threading.Thread.__init__(self)
    self.connexion = conn
    self.running = None
 
  def run(self):
    self.running = True

    # Dialogue avec le client :
    nom_tclient = self.getName()	    # Chaque thread possède un nom
    while self.running:      
      msgClient = self.connexion.recv(1024).decode("Utf8")
      if not msgClient or msgClient.upper() =="FIN":
        self.running = False

      message = "<{}> : {}".format(nom_tclient, msgClient)
      print(message)

      ats = re.findall(r'(@Thread-[0-9]+\b)',msgClient)

      if ats:
        for at in ats:
          at = at.replace("@","")
          if conn_clients.get(at):
            conn_clients[at].send(message.encode("Utf8"))
      elif msgClient == "#show_all":
        message = "Showing all : {}".format(conn_clients.keys())
        self.connexion.send(message.encode("Utf8"))
      else:
        # Faire suivre le message à tous les autres clients :
        for client in conn_clients.keys():
          if client != nom_tclient:	  # ne pas le renvoyer à l'émetteur
            conn_clients[client].send(message.encode("Utf8"))
      print("Clients : {}".format(conn_clients.keys()))

    # Le thread <client> se termine ici.
    # Fermeture de la connexion :
    self.connexion.close()	  # couper la connexion côté serveur
    del conn_clients[nom_tclient]	# supprimer son entrée dans le dictionnaire
    print("Client <{}> DÉCONNECTÉ.".format(nom_tclient))


def main():
 
  # Initialisation du serveur - Mise en place du socket :
  mySocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
  try:
    mySocket.bind((HOST, PORT))
  except socket.error:
    print("La liaison du socket à l'adresse choisie a échoué.")
    sys.exit()


  print("Serveur prêt, en attente de requêtes ...")
  mySocket.listen()
 

  # Attente et prise en charge des connexions demandées par les clients :
  while 1:
    connexion, adresse = mySocket.accept()

    # Créer un nouvel objet thread pour gérer la connexion :
    th = ThreadClient(connexion)
    th.start()

    # Mémoriser la connexion dans le dictionnaire :
    nom_tclient = th.getName()	  # identifiant du thread
    conn_clients[nom_tclient] = connexion
  
    print("Client <{} | {} | {}> CONNECTÉ.".format(nom_tclient, adresse[0], adresse[1]))

    # Dialogue avec le client :
    msg ="Vous êtes connecté <{}>. Envoyez vos messages!".format(nom_tclient)
    connexion.send(msg.encode("Utf8"))


if __name__ == '__main__':
  """
  Starts the whole app from the command line
  """

  main()  