package devoir04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Calendar2 extends GregorianCalendar {
	
	protected boolean cours;
	
	public void creation(Calendar2 test) {

		String[] actuel = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
		
		if (actuel.length == 0)
			System.exit(0);

		SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, actuel[0]);
		Calendar calendar = new GregorianCalendar(pdt);
		Date trialTime = new Date();
		calendar.setTime(trialTime);
		
		int jour1 = calendar.get(Calendar.DAY_OF_MONTH);
		int mois1 = calendar.get(Calendar.MONTH) + 1;
		int annee1 =  calendar.get(Calendar.YEAR);
		int heure1 = calendar.get(Calendar.HOUR);
		int minute1 = calendar.get(Calendar.MINUTE);
		int seconde1 = calendar.get(Calendar.SECOND);
		int milisec1 = calendar.get(Calendar.MILLISECOND);
		
		System.out.print("Heure de creation : "+jour1+"/"+mois1+"/"+annee1 + " ");
		System.out.println(heure1+":"+minute1+":"+seconde1+milisec1);

	}
	
	 public boolean getCours() {
		 
			if(this.get(Calendar.HOUR_OF_DAY)<12&&(this.get(Calendar.HOUR_OF_DAY)>9
					&& this.get(Calendar.MINUTE)>30)&&get(Calendar.DAY_OF_WEEK)==5) 
			     { cours=true;}
		    else { cours=false;}
			return cours;
		
	 }
	 
	 public void afficher(Calendar2 test) {
		
			String[] actuel = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
	
			if (actuel.length == 0)
				System.exit(0);
	
			SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, actuel[0]);
			Calendar calendar = new GregorianCalendar(pdt);
			Date trialTime = new Date();
			calendar.setTime(trialTime);
			
			int jour = calendar.get(Calendar.DAY_OF_MONTH);
			int mois = calendar.get(Calendar.MONTH) + 1;
			int annee =  calendar.get(Calendar.YEAR);
			int heure = calendar.get(Calendar.HOUR);
			int minute = calendar.get(Calendar.MINUTE);
			int seconde = calendar.get(Calendar.SECOND);
			int milisec = calendar.get(Calendar.MILLISECOND);
			
			System.out.print("Heure de actuel :" +jour+"/"+mois+"/"+annee + " ");
			System.out.println(heure+":"+minute+":"+seconde+milisec);	
		
	}
				
	 public void duree(Calendar2 test) throws InterruptedException{
		 
		 long duree = System.currentTimeMillis();
	     Thread.sleep(2000);
	     long fin = System.currentTimeMillis();
	     double tiempo = (double) ((fin - duree)/1000);
	     System.out.println("Différence entre l'heure actuelle et l'heure de création : "+tiempo +" millisecondes"
	     		+ "");       
	}
}
