package devoir03;

public class Reptile extends Animal {

	protected boolean domestique = false;

	public Reptile(String type, int pattes) { // les crocodile ont 4 pattes
		super(type, pattes);
		type = "Crocodile";
		pattes = 4;
		
	}					
	/** presentation des caracteristiques des reptiles */
	public void presente() {
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		int pattes = 4;
		
		System.out.println("je suis vraiment un animal " + etat + " et j'ai " + pattes + " pattes");
	}
	/** La peau des reptiles */
	public void la_peau() {
		String peau = "d'écailles";
		System.out.println("La peau est épaisse et kératinisée, et est composée " + peau);
	}
	
	public void crie() {
		String cri = "Unknown";
		System.out.println("Mon cri est le " + cri);
	}
}