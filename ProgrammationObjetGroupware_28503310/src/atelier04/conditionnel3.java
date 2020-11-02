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
		int sumatoria = 0;
		int arreglo[] = {p1, p2, p3, p4, p5};
		
		for (int x = 0; x < arreglo.length; x++) {
            sumatoria += arreglo[x];
        }
        double media = sumatoria / arreglo.length;
		
        Arrays.sort(arreglo);

        int mediane;
        int mitad = arreglo.length / 2;
        // Si la longitud es par, se deben promediar los del centro
        if (arreglo.length % 2 == 0) {
            mediane = (arreglo[mitad - 1] + arreglo[mitad]) / 2;
        } else {
            mediane = arreglo[mitad];
        }
        p6 = mediane;

        // Imprimir valores
        System.out.println("El arreglo es: ");
        for (int x = 0; x < arreglo.length; x++) {
            System.out.printf("%d ", arreglo[x]);
        }
        System.out.printf("\nLa media es %.2f y la mediana es %d", media, p6);

    }

}
