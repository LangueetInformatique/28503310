package atelier04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class conditionnel4 {
//https://masqueprogramar.wordpress.com/2018/05/23/media-mediana-array-java/	
	
	public static void main(String[] args) {
		int p1 = 10, p2 = -1, p3 = 9, p4 = 4, p5 = 8;

		//mediane(p1, p2, p3);
		//mediane(p1, p3, p2);
		//mediane(p2, p1, p3);
		//mediane(p2, p3, p1);
		//mediane(p3, p1, p2);
		//mediane(p3, p2, p1);
		
		
	}
				
		public static double median(double[] m) {
		    int middle = m.length/2;
		    if (m.length%2 == 1) {
		        return m[middle];
		    } else {
		        return (m[middle-1] + m[middle]) / 2.0;
		    }
		}}
