package atelier05;

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
	 * Constructeur vide. No hay parametros
	 */

	public void info_etud(String setnom, String setprenom, String setdateNaissance, int setnumero, int setnoteLicence, int setnoteMaster) {
		
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
	
	public String moyenne() {
		
		return "Sa moyenne est : " +((noteLicence+noteMaster)/2);
	}
	
	public String coordonees () {
		return "Nom : " +nom+ " prenom : " +prenom+ 
				"\nDate de naissance : " +dateNaissance+ 
				"\nNumero d'étudiant : " +numeroEtudiant+ "\nLicence : "+licence+ 
				", sa moyenne : "+noteLicence+
				"\net dans le master : "+master+ " avec la moyenne : "+noteMaster;
	}
	
	/**public Etudiant(String nom, String prenom, String dateNaissance, int numero, String licence, String master, int noteLicence, int noteMaster) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numeroEtudiant = numero;
		this.licence = licence;
		this.master = master;
		this.noteLicence = noteLicence;
		this.noteMaster = noteMaster;
	}*/
	
	

}
