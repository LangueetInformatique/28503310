package td02;

/**
 * Classe non-exécutable de la deuxième partie de l'atelier
 * @author Ana
 *
 */

public class B {
	
	/*
	 * 
	 *@param n int
	 *@return true si n est divisible par 13
	 *false sinon 
	 */

	public static int divise (int n){
		
		if (A.treize(n) == true)
			return n / 2;
		else
			return n + 2;

	}

}
