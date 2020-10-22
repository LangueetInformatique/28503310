package atelier05;

public class Etudiant {
	String nom, prenom;
	int numeroEtudiant;
	
	/**
	 * Constructor vacio. No hay parametros
	 */

	public Etudiant() {
		
	}
	/**Constructor no vacio
	 * 
	 */
	
	public Etudiant(String nom, String prenom, int numero) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numeroEtudiant = numero;
	}

}
