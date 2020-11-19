package atelier08;

import java.io.IOException;

public class division {
	public static void main(String[] args) {
		int i = 1000, j;
		try {
			
			do {
				i--;
				j = 1 / i;}
			while (i>=0);
			System.out.println("Fin du programme");
		}
		catch (ArithmeticException e) {
			
			System.out.println("J'ai capture l'exception avec ce message");
			System.out.println(e.getMessage());
			}
	}
}
