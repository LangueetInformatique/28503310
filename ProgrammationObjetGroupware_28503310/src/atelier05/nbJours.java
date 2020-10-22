package atelier05;

import cours04.Date;

public class nbJours {

	public static void main(String[] args) {
		Date deseada = new Date(31,10,2020);
		Date hoy = new Date(22,10,2020);
		//int jours = compter(hoy,actual);
		
		int nb = 0;
				
		while (hoy.CompareTo(deseada) == true) {
			hoy.Incrementer();
			nb++;
		}

	System.out.println(nb);

	}
}