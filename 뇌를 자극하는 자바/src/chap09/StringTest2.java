package chap09;

public class StringTest2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
for(int i=1; i<100000; i++) {
			
		}
		String str = "��� ��¥�� ����";
		str += "�ս� ������";
		str += "����ó��";
		System.out.println(str);
for(int i=1; i<100000; i++) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("���� �ð�:" + (end - start)/1000.0);
	}

}
