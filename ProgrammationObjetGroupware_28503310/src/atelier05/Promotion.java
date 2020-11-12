package atelier05;

import java.util.Scanner;

public class Promotion {
	String nom, prenom;
	int numeroEtudiant, totaldesetudiants,moyenne_etudiant, moyennegenerale;
	
	/*public Promotion(String nom, String prenom, int numeroEtudiant, int totaldesetudiants, int moyenne_etudiant, int moyennegenerale) {
		
	}*/
	
	public static void main(String[] args) {
		
		Etudiant etudiant1= new Etudiant(); //instanciar o ejemplarizar una clase
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Donnez le total des etudiants : ");
		
		int totaldesetudiants = escaner.nextInt();
		
		for(int x=0; x<=totaldesetudiants; x++) {
			
			etudiant1.info_etud(escaner.nextLine(), escaner.nextLine(), escaner.nextLine(), escaner.nextInt(), escaner.nextInt(), escaner.nextInt());
			//etudiant1.info_etud("ARMENTA", "Ana", "01/05/81", 28503310, 13, 7);
				
			
		}
            
        System.out.println(etudiant1.coordonees());
		
		System.out.println(etudiant1.moyenne());
		escaner.close();
	}
	
	public void info_prom(int settotaldesetudiants, int setmoyenne_etudiant, int setmoyennegenerale) {
		
		totaldesetudiants = settotaldesetudiants;
		moyenne_etudiant = setmoyenne_etudiant;
		moyenne_etudiant = setmoyennegenerale;
				
	}
	
	

}