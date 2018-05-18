package chap06;

public class InterfaceExample2 {

	public static void main(String[] args) {
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("111원1111원", "코딩의신", "원영재");
		arr[1] = new SeparateVolume("1111원111원", "소스의신", "원영재");
		arr[2] = new AppCDInfo("1994-1202", "MVC을 위한 자바 프로그래밍");
		checkOutAll(arr,"이승학","2018-05-18");
	}
	static void checkOutAll(Lendable arr[],String borrower, String date) {
		for(int cnt = 0; cnt<arr.length; cnt++)
			arr[cnt].checkOut(borrower, date);
	}

}
