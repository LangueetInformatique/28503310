package devoir04;

public class testCalendar2 {

	public static void main(String[] args) throws InterruptedException {
		Calendar2 test = new Calendar2();
		
		System.out.println(test.getCours());		
		
		test.creation(test);
		test.afficher(test);
		test.duree(test);

	}

}
