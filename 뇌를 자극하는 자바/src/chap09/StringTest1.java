package chap09;

public class StringTest1 {

	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i=1; i<100000; i++) {
			
		}
		String str = "�Ƹ��ٿ� �� ���� �ݼ����꿡 �ܱ� �Ҿƹ����� �� �����ð�" +
				"ȫ���ΰ� ������ ���� ����� ���ռ� �Ǹ��� �ι��� ����" +
				"���� ���� ����� ���� ������ �˿��� ���� ���ż�"+
				"���� ���� �޷��� �������� �Ŷ� �屺 �̻��"+
				"��ἱ�� �� ��� ��õ �ó� ���ڿ�"+
				"Ȳ����� ��� �¼� �ο� ��â ����� �帥��";
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println("���� �ð�:" + (end - start)/1000.0);
	}

}