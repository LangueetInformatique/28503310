package atelier06;

public class Oiseau extends Animal{
	protected boolean domestique = true;

	public Oiseau(String type, int pattes) {
		super(type,pattes);
		type = "Oiseau";
		pattes = 2;
	}
	/** presentation des caracteristiques d'oiseau */
		public void presente() {
			super.presente();
			String etat = (domestique) ? "domestique" : "sauvage";
			int pattes = 2;
			
			System.out.println("Je suis vraiment un animal " + etat+ " et j'ai " + pattes + " pattes");
		}
		/** cri du félin */
		public void crie() {
			String cri = "piopio";
			System.out.println("Mon cri est le " + cri);
		}	
}