package chap06;

public class InterfaceExample1 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("111원1111원","코딩의 신" , "원영재");
		
		AppCDInfo obj2 = new AppCDInfo("1994-1202","원영재 출생일");
		obj1.checkOut("이승학", "201805180");
		obj2.checkOut("연재호", "201805180");
		obj1.checkIn();
		obj2.checkIn();
		

	}

}
