package chap06;

public class InterfaceExample1 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("111��1111��","�ڵ��� ��" , "������");
		
		AppCDInfo obj2 = new AppCDInfo("1994-1202","������ �����");
		obj1.checkOut("�̽���", "201805180");
		obj2.checkOut("����ȣ", "201805180");
		obj1.checkIn();
		obj2.checkIn();
		

	}

}
