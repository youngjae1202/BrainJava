package chap08;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {

	public static void main(String[] args) {
		
		GregorianCalendar obj =
				new java.util.GregorianCalendar();
		int year = obj.get(Calendar.YEAR);
		int month = obj.get(Calendar.MONTH) + 1;
		int day = obj.get(Calendar.DAY_OF_MONTH);
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�. %n", year, month, day);
	}

}
