package chap09;

import java.util.GregorianCalendar;
import java.util.Random;

public class LottoGame {

	public static void main(String[] args) {
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		int frontcount = 0 , backcount = 0;
		Random random = new Random(gcalendar.getTimeInMillis());		
		for(int i=1; i<=10; i++) {
			int randomValue = random.nextInt(2);
			if(randomValue == 0) {
				frontcount ++;
				System.out.println("¾Õ¸é");
			}else {
				backcount++;
				System.out.println("µÞ¸é");
			}
			
		}
		
		}

}
