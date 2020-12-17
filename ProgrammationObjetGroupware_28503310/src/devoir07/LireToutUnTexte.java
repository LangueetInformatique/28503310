package devoir07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LireToutUnTexte {
	private String texte;

	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 */
	public LireToutUnTexte(File ft) {
		String ligne = null;
		texte = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne = br.readLine()) != null) {
				texte += ligne + "\n";
			}

		}

		catch (IOException e) {
		}
	}
	
	/** affichage du contenu de Stexte
	 * 
	 */
	public void afficher() {
		System.out.println(texte);
	}

	/**
	 * Recherche du nombre d'occurences de s dans sTexte
	 * 
	 * @param s chaîne cherchée
	 * @return nombre d'occurences
	 * 
	 */
	public int Chercher(String s) {

		return 0;
	}

	/**
	 * Affichage du contexte des occurences de s dans sTexte
	 * 
	 * @param s      chaîne cherchée
	 * @param taille taille du contexte
	 */
	public void ChercherVoir(String s, int taille) {

		return;
	}
	
	public int ChercherER(String s) {
		return 0;

		
	}
}