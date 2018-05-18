package chap09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class After100Days {

	public static void main(String[] args) {
	/*
	 * Calendar cal = Calendar.getInstance();
	 * cal.setTime(new Date());
	 * cal.add(Calendar.DATE,2);
	 * cal.add(Calendar.MONTH,2);
	 * */
		
		
		/*GregorianCalendar gCalendar = new GregorianCalendar();
		int date;
		date = gCalendar.get(gCalendar.DATE);
		
		System.out.println(date);
		System.out.println();*/
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(new Date());
	calendar.add(Calendar.DATE, 100);
	SimpleDateFormat dateFormat =
			new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ ");
	String date= dateFormat.format(calendar.getTime());
	System.out.println(date);
	}

}
