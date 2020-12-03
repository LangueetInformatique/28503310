package devoir05;

public class PileFace {
	
	public static void main(String[]args) {
		Aleat a = new Aleat(2);
		double pile = 0;
		double face = 0;
		
		for(int i = 0; i<1000; i++) {
			if (a.get()==1)
				pile ++;
			else
				face++;
		}
		
		double moyenne_pile;
		double moyenne_face;
		
		moyenne_pile = pile/1000;
		moyenne_face = face/1000;
		
		System.out.println("Pile : "+pile + " | " +"Face : "+face);
		System.out.println("La moyenne des piles sur un millier de lancers est : "+
		moyenne_pile);
		System.out.println("La moyenne des faces sur un millier de lancers est : "+
		moyenne_face);
	}

}
