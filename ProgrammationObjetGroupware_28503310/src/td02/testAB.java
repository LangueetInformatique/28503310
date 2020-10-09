package td02;

/*
 * Classe exécutable de la deuxième partie de l'atelier
 */

public class testAB {
	
	/*
	 * Iniciation d'une variable i avec à la valeur 1
	 * executant m fois (10) la methode
	 */

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		
		int i = 1, m =10, x = 0;
		for (int j = 0; j< m; j++){
			if(j==0)
				x = B.divise(i);
			else
				x = B.divise(x);
				
			System.out.println(x);
			
			/*
			 * 	int i = 1, m =10, x = 0;
			 * 	
			 * 	int x = B.divise(i);
				for (int j = 1; j< m; j++){
					x = B.divise(x);
					System.out.println(x);
			 */
		}

	}

}