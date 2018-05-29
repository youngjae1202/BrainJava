package chap06;

public interface Lendable { //첫 인터페이스로 만듬
	
	//상수필드
	final static byte STATE_BOPROWED = 1; // 대출 중
	final static byte STATE_NORMAL = 0; //대출되지 않은 상태
	
	//추상메소드
	void checkOut (String borrower, String date)throws Exception;
	void checkIn();
}
