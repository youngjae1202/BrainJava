package chap06;

public interface Lendable { //ù �������̽��� ����
	
	//����ʵ�
	final static byte STATE_BOPROWED = 1; // ���� ��
	final static byte STATE_NORMAL = 0; //������� ���� ����
	
	//�߻�޼ҵ�
	void checkOut (String borrower, String date)throws Exception;
	void checkIn();
}
