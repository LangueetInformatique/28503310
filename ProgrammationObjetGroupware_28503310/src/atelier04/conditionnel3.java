package atelier04;
import java.util.Arrays;

public class conditionnel3 {

	public static void main(String[] args) {
		int p1 = 10, p2 = -1, p3 = 9, p4 = 4, p5 = 8;

		mediane(p1, p2, p3, p4, p5);
		mediane(p2, p3, p4, p5, p1);
		mediane(p3, p4, p5, p1, p2);
		mediane(p4, p5, p1, p2, p3);
		mediane(p5, p1, p2, p3, p4);
				
	}

	public static void mediane(int p1, int p2, int p3, int p4, int p5) {
		
		int p6 = 0;
		int arreglo[] = {p1, p2, p3, p4, p5}; // on va organiser les chiffres
		
		Arrays.sort(arreglo);

        int mediane;
        int moitie = arreglo.length / 2; // pour trouver la moitié de la serie
        
        if (arreglo.length % 2 == 0) { // si le tableau est pair, il faut faire la moyenne des deux chiffres au centre
            mediane = (arreglo[moitie - 1] + arreglo[moitie]) / 2;
        } else {
            mediane = arreglo[moitie];
        }
        p6 = mediane;

        // On peut imprimer la serie ordonée
        /**System.out.println("El arreglo es: ");
        for (int x = 0; x < arreglo.length; x++) {
        	
            System.out.printf("%d ", arreglo[x]);
        
        }**/
        
        System.out.printf("\nLa mediane est %d", p6);
        
	}

}
