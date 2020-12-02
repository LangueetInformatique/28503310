package devoir01;

import java.util.Arrays;

/** Exercice 4 : Ajouter les instructions structurées par des branchements 
 * conditionnels permettant d’obtenir la médiane des variables 
 * p1, p2, p3, p4, p5 dans la variable p6.*/

public class moyenne {

	public static void main(String[] args) {
		int p1 = 10, p2 = -1, p3 = 9, p4 = 4, p5 = 8;
		
		mediane(p1, p2, p3, p4, p5);
		mediane(p2, p3, p4, p5, p1);
		mediane(p3, p4, p5, p1, p2);
		mediane(p4, p5, p1, p2, p3);
		mediane(p5, p1, p2, p3, p4);
				
	}
	
	/**
	 * Parametre avec lesquels on va calculer la medianne
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 */

	public static void mediane(int p1, int p2, int p3, int p4, int p5) {
		
		int p6;
		int arreglo[] = {p1, p2, p3, p4, p5}; // on va organiser les chiffres
		
		Arrays.sort(arreglo);

        int moitie = arreglo.length / 2; // pour trouver la moitié de la serie
        
        if (arreglo.length % 2 == 0) { // si le tableau est pair, il faut faire la moyenne des deux chiffres au centre
        	p6 = (arreglo[moitie - 1] + arreglo[moitie]) / 2;
        } else {
        	p6 = arreglo[moitie];
        }
        
        // On peut imprimer la serie ordonée

        System.out.printf("\nLa mediane est : %d", p6);
        
	}

}