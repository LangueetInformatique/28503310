package devoir05;

import java.util.Scanner;

/** classe enveloppe du resultat du jet de 3 des
 * 
 * @author tyratron
 *
 */
public class TroisDes {
	Aleat a = new Aleat(3);
	int d1, d2, d3;
	String nom;
	
	
	public void TroisDes() {

		
		for(int i = 0; i<10; i++) {
			if (a.get()==1)
				d1 ++;
			else if (a.get()==2)
				d2++;
			else
				d3++;
		}
		System.out.println("Des1 : " + d1+ " Des2 : " + d2+ " Des3 : " + d3);
		
	}
	
	public String dados() {
				
		return "Des1 : " + d1+ "Des2 : " + d2+ "Des3 : " + d3;
	}
	
	public String nom () {
		System.out.println("Tapez votre nom");
		Scanner nom = new Scanner(System.in);
		String n = nom.next();
				
		return n;
	}
		

	
}
