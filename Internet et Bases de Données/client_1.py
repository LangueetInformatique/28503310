# Définition d'un client réseau rudimentaire
# Ce client dialogue avec un serveur ad hoc
 
import socket, sys
 
#HOST = socket.gethostbyname(socket.gethostname())
HOST = "127.0.0.1"
PORT = 50001


# 1) création du socket 
mySocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
 
# 2) envoi d'une requête de connexion au serveur 
try:
  mySocket.connect((HOST, PORT))
except socket.error:
  print("La connexion a échoué.")
  sys.exit()
print("Connexion établie avec le serveur.")
 
# 3) Dialogue avec le serveur :
 
while 1:

  msgServeur = mySocket.recv(1024).decode("Utf8")
  print("S > {}".format(msgServeur))

  msgClient = input("Vous > ")

  if msgClient.upper() == "FIN":
    break

  mySocket.sendall(msgClient.encode("Utf8"))
 
# 4) Fermeture de la connexion :
print("Connexion interrompue.")
mySocket.close()