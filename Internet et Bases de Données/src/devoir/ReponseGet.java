package devoir;

import java.io.*;
import java.net.*;

public class ReponseGet {
	
	/** Reponse RGET
	* @param rep répertoire racine du site
	*/
	void RGet (String rep) {
	String sUA, sSA;
	try {
	// lecture de l'entête et recherche de la ressource demandée
	sUA = from.readLine(); System.err.println(sUA);
	String[] tag = sUA.split(" ");
	if ((tag[0].equals("GET")) == false) return;
	File fin= new File(tag[1].replaceFirst("/", rep));
	if (fin.exists() == false) {
	sSA = " HTTP/1.1 404 NOT FOUND\n";
	System.err.print(sSA + " "); to.println(sSA);
	return;
	}
	do {
	sUA = from.readLine(); System.err.println(sUA);
	} while (sUA.length() != 0);
	
	// requête acceptée
	sSA = " HTTP/1.1 200 OK";
	System.err.println(sSA); to.println(sSA);
	//taille du corps du message
	FileReader fr = new FileReader(fin);
	long taille = fin.length();
	sSA = "Content-Length: " + taille +"\n";
	System.err.println(sSA); to.println(sSA);
	// lecture du fichier et creation du corps
	int n = 0; int c;
	do {
	c = fr.read(); to.write(c); n++;
	} while (n < taille);
	fr.close();
	to.println(); // fin du message
	}
	catch (Exception e) {
	System.err.println(e);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
