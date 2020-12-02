package devoir03;

/**
 * Cr�er et tester une des trois arborescences suivantes de classes
 * en ajoutant au moins un attribut et une m�thode � chaque d�rivation
 * 1) Animal (2 attributs, 2 m�thodes) -> Reptile -> Crocodile
 * @author anita
 *
 */

public class Reptile extends Animal {

	protected boolean domestique = false;
	
	/**
	 * Caract�ristiques generales d�un reptile.
	 * @param type
	 * @param pattes
	 */

	public Reptile(String type, int pattes) { // les crocodiles ont 4 pattes
		super(type, pattes);
		type = "Crocodile";
		pattes = 4;
		
	}	
	
	public void presente() {
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		int pattes = 4;
		
		System.out.println("je suis vraiment un animal " + etat + " et j'ai " + pattes + " pattes");
	}
	
	/**  
	 * La peau des reptiles
	 */
	
	public void la_peau() {
		String peau = "d'�cailles";
		System.out.println("La peau est �paisse et k�ratinis�e, et est compos�e " + peau);
	}
	
	/**
	 * Le crie des reptiles 
	 */
	
	public void crie() {
		String cri = "inconnu";
		System.out.println("Mon cri est " + cri);
	}
	
	/** 
	 * La reproduction des reptiles 
	 */
	
	public void la_reproduction() {
		String reproduction = "Ils sont ovipares";
		System.out.println("La reproduction : " + reproduction);
	}
	
	/** 
	 * La repartition des reptiles 
	 */
	
	public void leur_localisation() {
		String repartition = "Les crocodiles se rencontrent dans les r�gions tropicales humides.";
		System.out.println("O� se trouvent ? " + repartition);
	}
	
}