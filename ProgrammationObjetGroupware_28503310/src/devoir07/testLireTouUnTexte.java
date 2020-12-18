package devoir07;
/*
 * Lire et chercher dans le texte andromaque.txt
 */
import java.io.File;

public class testLireTouUnTexte {

	public static void main(String[] args) {
				
		LireToutUnTexte lt = new LireToutUnTexte(new File("livres/andromaque.txt"));
		lt.afficher();
		lt.ChercherER();
		
	}

}
