package chap06;

public class AppCDInfo extends CDInfo implements Lendable {
	
	String borrower;   //������
	String checkOutDate; //������
	byte state;		   //�������
	
	//extends CDInfo��� ����� ��ӹ޴´�
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}
	//Implements ������ ��ɸ� �����´�
	@Override
	public void checkOut(String borrower, String date) {
		if(state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BOPROWED;
		System.out.println("*"+ title + "�� ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + "�� �ݳ��Ǿ����ϴ�.");
		
	}
}
