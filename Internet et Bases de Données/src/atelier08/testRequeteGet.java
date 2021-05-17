
package atelier08;


public class testRequeteGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Etablissement de la connexion
		RequeteGet p = new RequeteGet("www.ouest-france.fr", 80);
		// Envoi de la requete et lecture de la reponse
		p.Get("texto.txt", "www.ouest-france.fr", "texto.txt");
		// fermeture de la connexion
		p.fin(); 

	}

}

