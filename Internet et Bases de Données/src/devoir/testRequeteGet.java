package devoir;

import java.io.*;
import java.net.*;

public class testRequeteGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Etablissement de la connexion
		RequeteGet p = new RequeteGet("www.paris4.sorbonne.fr", 80);
		// Envoi de la requête et lecture de la réponse
		p.Get("devoir/", "www.paris4.sorbonne.fr");
		// fermeture de la connexion
		p.fin();

	}

}
