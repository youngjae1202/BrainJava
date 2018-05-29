package chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExample3 {

	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("111원", "원영재에대하여", "원영재");
		printState(obj);
		obj.checkOut("이승학","20180518");
		printState(obj);
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String StrDate = sf.format(date);
		System.out.println(StrDate);
	}
	static void printState(SeparateVolume obj) {
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("---------------");
			System.out.println("대출상태: 대출가능");
			System.out.println("---------------");
		}
		//if(obj.state == Lendable.STATE_BOPROWED)
		else{
			System.out.println("-----------------");
			System.out.println("대출 상태: 대출중");
			System.out.println("대출인:" + obj.borrower);
			System.out.println("대출일:" + obj.checkOutDate);
			System.out.println("-----------------");
		}
	}

}
