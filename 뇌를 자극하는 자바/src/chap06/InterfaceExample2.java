package chap06;

public class InterfaceExample2 {

	public static void main(String[] args) {
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("111��1111��", "�ڵ��ǽ�", "������");
		arr[1] = new SeparateVolume("1111��111��", "�ҽ��ǽ�", "������");
		arr[2] = new AppCDInfo("1994-1202", "MVC�� ���� �ڹ� ���α׷���");
		checkOutAll(arr,"�̽���","2018-05-18");
	}
	static void checkOutAll(Lendable arr[],String borrower, String date) {
		for(int cnt = 0; cnt<arr.length; cnt++)
			arr[cnt].checkOut(borrower, date);
	}

}
