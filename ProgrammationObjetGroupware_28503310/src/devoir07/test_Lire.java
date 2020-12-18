package devoir07;

import java.io.File;

public class test_Lire {


	public static void main(String[] args) {
		
		LireToutUnTexte lt = new LireToutUnTexte(new File("livres/adelaide.txt"));
		lt.afficher();
		
		
	}

}
