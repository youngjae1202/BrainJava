package chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExample3 {

	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("111��", "�����翡���Ͽ�", "������");
		printState(obj);
		obj.checkOut("�̽���","20180518");
		printState(obj);
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String StrDate = sf.format(date);
		System.out.println(StrDate);
	}
	static void printState(SeparateVolume obj) {
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("---------------");
			System.out.println("�������: ���Ⱑ��");
			System.out.println("---------------");
		}
		//if(obj.state == Lendable.STATE_BOPROWED)
		else{
			System.out.println("-----------------");
			System.out.println("���� ����: ������");
			System.out.println("������:" + obj.borrower);
			System.out.println("������:" + obj.checkOutDate);
			System.out.println("-----------------");
		}
	}

}
