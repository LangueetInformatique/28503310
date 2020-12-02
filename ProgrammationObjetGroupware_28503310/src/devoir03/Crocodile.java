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
	 * 
	 * @param type
	 * @param pattes
	 */

	public Crocodile(String type, int pattes) {
		super(type, pattes);
		
	}
	
	public void presente() {
		super.presente();  // appel de la methode de la sur-classe
		System.out.println("et je m'appelle " + nom());
	}
	
	private String nom() {

		return null;
	}

	public void la_peau() {

		return;
	}
	
}