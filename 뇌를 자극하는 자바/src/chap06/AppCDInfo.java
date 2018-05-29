package chap06;

public class AppCDInfo extends CDInfo implements Lendable {
	
	String borrower;   //대출인
	String checkOutDate; //재출일
	byte state;		   //대출상태
	
	//extends CDInfo라는 기능을 상속받는다
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}
	//Implements 공통의 기능만 가져온다
	@Override
	public void checkOut(String borrower, String date) {
		if(state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BOPROWED;
		System.out.println("*"+ title + "가 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + "가 반납되었습니다.");
		
	}
}
