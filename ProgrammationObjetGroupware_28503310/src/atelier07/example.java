package atelier07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class example {

	public static void main(String[] args) {
		// get the supported ids for GMT-08:00 (Pacific Standard Time)
		 String[] ids = TimeZone.getAvailableIDs(+1 * 60 * 60 * 1000);
		 // if no ids were returned, something is wrong. get out.
		 if (ids.length == 0)
		     System.exit(0);

		  // begin output
		 System.out.println("Current Time");

		 // create a Pacific Standard Time time zone
		 SimpleTimeZone pdt = new SimpleTimeZone(+1 * 60 * 60 * 1000, ids[0]);

		 // set up rules for Daylight Saving Time
		 pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		 pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

		 // create a GregorianCalendar with the Pacific Daylight time zone
		 // and the current date and time
		 Calendar calendar = new GregorianCalendar(pdt);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);

		 // print out a bunch of interesting things
		 
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " +(calendar.get(Calendar.MONTH)+(1)));
		 
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 		 
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	}

}
