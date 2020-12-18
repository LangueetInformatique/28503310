package devoir07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LireToutUnTexte {
	/**
	 * Chercher les flexions du verbe aimer
	 * au pr�sent de l'indicatif 
	 */

	public void ChercherER() {
		String patron;		
		patron = ("aime([srz]|(ent)|(ons))"); 
		System.out.println(Stexte.matches(patron));
		Pattern pat = Pattern.compile(patron);
		Matcher mat = pat.matcher(Stexte);
		if (mat.matches()) {
			System.out.println("Il exist");
		}
		else {
			System.out.println("Il n'exist pas dans le texte");
		}
	}
	
	private String Stexte;
	
	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 */
	
	public LireToutUnTexte(File ft) {
		String ligne = null;
		Stexte = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne = br.readLine()) != null) {
				Stexte += ligne + "\n";
			}
		}
		catch (IOException e) {
		}
	}

	/** affichage du contenu de Stexte
	 * 
	 */
	
	public void afficher() {
		System.out.println(Stexte);
	}

	/**
	 * Recherche du nombre d'occurences de s dans sTexte
	 * 
	 * @param s chaîne cherchée
	 * @return nombre d'occurences
	 * 
	 */
	
	public int Chercher(String s) {
		int deb = -1, nOcc = 0;
		while ((deb = Stexte.indexOf(s, deb+1)) != -1)
			nOcc++;
		return nOcc;
	}

	/**
	 * Affichage du contexte des occurences de s dans sTexte
	 * 
	 * @param s      chaîne cherchée
	 * @param taille taille du contexte
	 */
	
	public static String ChercherVoir(String texte, String chaine, int Contexte_mots) {
		String s2;
		String contexte;
		if(texte.contains(chaine)) {		
			int index_start = texte.indexOf(chaine) - (Contexte_mots) ;
			int index_end = texte.indexOf(chaine) + (Contexte_mots + chaine.length());
			contexte = texte.substring(index_start,index_end);
		}
		else {
			contexte = null;
			System.out.println("la chaine cherchée n'est pas dans le texte");
		}
		return contexte;
	}
}