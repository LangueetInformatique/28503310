package devoir03;

import devoir03.Animal;
import devoir03.Reptile;

/**
 * 
 * @author anita
 *
 */

public class Crocodile extends Reptile{
	
	private String nom;
	/**
	 * @param type
	 */

	public Crocodile(String type, int pattes) {
		super(type, pattes);
		
	}
	
	/** presentation des caracteristiques des crocodiles */
	public void presente() {
		super.presente();  // appel de la methode de la sur-classe
		System.out.println("et je m'appelle " + nom());
	}


	private String nom() {
		// TODO Auto-generated method stub
		return null;
	}

	public void la_peau() {
		// TODO Auto-generated method stub
		return;
	}
	
}