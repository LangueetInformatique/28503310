package devoir02;


public class Etudiant {
	String nom;
	String prenom;
	String dateNaissance;
	int numeroEtudiant;
	String licence;
	String master;
	int noteLicence;
	int noteMaster;
	
	/**
	 * Caractéristiques principales d’un étudiant.
	 * @param setnom
	 * @param setprenom
	 * @param setdateNaissance
	 * @param setnumero
	 * @param setnoteLicence
	 * @param setnoteMaster
	 */

	public void info_nom(String setnom, String setprenom, String setdateNaissance, int setnumero, int setnoteLicence, int setnoteMaster) {
		
		nom = setnom;	
		prenom = setprenom;
		dateNaissance = setdateNaissance;
		numeroEtudiant = setnumero;
		noteLicence= setnoteLicence;
		noteMaster = setnoteMaster;
				
	}
		
	public Etudiant() {
	
	licence = "LFTI";
	master = "Langue et Informatique";
	
	}
	
	/**
	 * Return la moyenne d'un(e) etudiant(e)
	 * @return
	 */
	public String moyenne() {
		
		return "Sa moyenne est : " +((noteLicence+noteMaster)/2);
	}
	
	/**
	 * il renvoie les coodonees des etudiants(es)
	 * @return
	 */
	public String coordonees () {
		return "Nom : " +nom+ " prenom : " +prenom+ 
				"\nDate de naissance : " +dateNaissance+ 
				"\nNumero d'étudiant : " +numeroEtudiant+ "\nLicence : "+licence+ 
				", sa moyenne : "+noteLicence+
				"\net dans le master : "+master+ " avec la moyenne : "+noteMaster;
	}

}
