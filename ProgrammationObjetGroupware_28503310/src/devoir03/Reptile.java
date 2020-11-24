package devoir03;

public class Reptile extends Animal {

	protected boolean domestique = false;

	public Reptile(String type, int pattes) { // les crocodiles ont 4 pattes
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
	/** La peau des reptiles 
	 * @return */
	public void la_peau() {
		String peau = "d'écailles";
		System.out.println("La peau est épaisse et kératinisée, et est composée " + peau);
	}
	/** Le crie des reptiles 
	 * * @return */
	public void crie() {
		String cri = "inconnu";
		System.out.println("Mon cri est " + cri);
	}
	/** La reproduction des reptiles 
	 * * @return */
	public void la_reproduction() {
		String reproduction = "Ils sont ovipares";
		System.out.println("La reproduction : " + reproduction);
	}
	/** La repartition des reptiles 
	 * * @return */
	public void leur_localisation() {
		String repartition = "Les crocodiles se rencontrent dans les régions tropicales humides.";
		System.out.println("Où se trouvent ? " + repartition);
	}
	
}