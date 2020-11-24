package atelier06;

/** Creation et gestion de felins */
public class Felin extends Animal {
// ajout d'attributs propres a la sous-classe
	protected boolean domestique = false;
	/**
	 * le constructeur de Felins fait appel au constructeur de la sur-classe Animal
	 */
	public Felin(String type) { // les felins ont 4 pattes , int pattes
		super(type, 4); //, pattes
		type = "Felin";
		//pattes = 4;
		
	}					
	/** presentation des caracteristiques du felin */
	public void presente() {
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		int pattes = 4;
		
		System.out.println("je suis vraiment un animal " + etat + " et j'ai " + pattes + " pattes");
	}
	/** cri du félin */
	public void crie() {
		String cri = "Miau";
		System.out.println("Mon cri est le " + cri);
	}
}
	