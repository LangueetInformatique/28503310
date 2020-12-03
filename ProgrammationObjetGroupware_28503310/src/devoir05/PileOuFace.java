package devoir05;

/**
 * Test de documentation
 */

import java.util.Scanner;

public class PileOuFace {
	public static void main (String[] args ){
		int c=0;
		for (int p = 1; p<4 ; ++p) {
			double x = Math.random();
			System.out.println("Voulez-vous rejouer ? Tapez true ou false");
			Scanner pile = new Scanner(System.in);
			String n = pile.next();
			//int c=0;
			if (n.equals("true")) {
				System.out.println("Tapez 0 pour Pile ou 1 pour Face ?");
				int i = pile.nextInt();
				int Toto = 0;
			if(x>0.5) {
				Toto=1;
			}
			if (Toto==0) {
				System.out.println("Pile");
			}
			else {
				System.out.println("Face");
					
			}
			if (i==Toto) {
				System.out.println("Manche "+p+" Gagné");
				++c;
			}
			else {
				System.out.println("Manche "+p+" Perdu !");
			}
		}
		else {
			System.out.println("Merci, Chao");
		}
	
		}
		if (c>2) {
			System.out.println("Partie Gagné ! ");
		}
		else {
			System.out.println("Partie perdue ");
		}
		
	}
	
}
