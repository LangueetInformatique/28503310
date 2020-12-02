package devoir02;

/**
 * Le but de cet exercice est de modéliser une promotion d’étudiants 
 * par les classes Etudiant et Promotion.
 * @author anita
 *
 */

public class Promotion {
	String nom, prenom;
	int numeroEtudiant, totaldesetudiants,moyenne_etudiant, moyennegenerale;
	
	/**
	 * Parametre pour creer les squelettes des méthodes correspondantes dans Promotion.
	 * @param nom
	 * @param prenom
	 * @param numeroEtudiant
	 * @param totaldesetudiants
	 * @param moyenne_etudiant
	 * @param moyennegenerale
	 */
	public Promotion(String nom, String prenom, int numeroEtudiant, int totaldesetudiants, int moyenne_etudiant, int moyennegenerale) {
		
	}
	
	public static void main(String[] args) {
		
		Etudiant etudiant1= new Etudiant(); //instanciar o ejemplarizar una clase
		
		etudiant1.info_nom("ORTIZ", "Manuel", "01/12/96", 12345678, 13, 7);
		
		System.out.println(etudiant1.coordonees());
		
		System.out.println(etudiant1.moyenne());
	}

}
