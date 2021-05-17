package devoir;

import java.io.*;
import java.net.*;

public class RequeteGet {
	
		void Get (String chemin, String host, String fout) {
			String sUA, sSA;
			try {
				FileWriter fw = new FileWriter(new File(fout));
				sUA = "GET " + chemin + " HTTP/1.1\r\nHost: " + host + "\r\n";
				System.err.print(sUA + " ");
				to.println(sUA);
				
				// lecture de l'entête et recherche de la taille du corps
				String tagTaille = "Content-Length: ";
				int taille = 0;
				do {
					sSA = from.readLine();
					System.err.println(sSA);
					if (sSA.startsWith(tagTaille) == true)
						taille = Integer.parseInt(sSA.substring(tagTaille.length()));
				}
				while (sSA.length() != 0);
					System.err.println("fin de l'entête");
					System.err.println("la taille du corps du message est " + taille);
				// lecture du corps et sauvegarde du fichier
				int n = 0;
				int c;
				do { c = from.read(); fw.write(c); n++; }
				while (n < taille);
				fw.close();
				}
			catch (Exception e) { System.err.println(e);
			}
		}
	}