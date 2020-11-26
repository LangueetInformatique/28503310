package atelier07;

import java.util.*;

public class date {
	
	public static void main(String[] args) {
		
		// get the supported ids for GMT-08:00 (Pacific Standard Time)
		String[] ids = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
				 
		// if no ids were returned, something is wrong. get out.
		if (ids.length == 0)
			System.exit(0);

		 // begin output
		 System.out.println("Date et l’heure courante.");

		 // create a Pacific Standard Time time zone
		 SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, ids[0]);
		 Calendar calendar = new GregorianCalendar(pdt);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);

		 // print out a bunch of interesting things
		  
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));		
	}
}
