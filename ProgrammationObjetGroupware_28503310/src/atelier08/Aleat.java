package atelier08;

/** G�n�rateur de nombres entiers naturels aleatoires
 * @author montacie
 */
public class Aleat {
	private int maximum;
	
	/** instanciation 
	 * @param maximum nombre maximum g�n�rateur */
	public Aleat(int maximum) {
		this.maximum = maximum;
	}

	/** @return nombre aleatoire */
	public int get() {
		return (int)(Math.random() * maximum) + 1;
	}
}
