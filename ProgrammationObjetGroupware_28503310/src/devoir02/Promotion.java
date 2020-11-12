package devoir02;

public class Promotion {
	String nom, prenom;
	int numeroEtudiant, totaldesetudiants,moyenne_etudiant, moyennegenerale;
	
	public Promotion(String nom, String prenom, int numeroEtudiant, int totaldesetudiants, int moyenne_etudiant, int moyennegenerale) {
		
	}
	
	public static void main(String[] args) {
		
		Etudiant etudiant1= new Etudiant(); //instanciar o ejemplarizar una clase
		
		etudiant1.info_nom("ORTIZ", "Manuel", "01/12/96", 12345678, 13, 7);
		
		System.out.println(etudiant1.coordonees());
		
		System.out.println(etudiant1.moyenne());
	}

}
