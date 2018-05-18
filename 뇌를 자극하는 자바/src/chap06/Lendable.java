package chap06;

public interface Lendable { //첫 인터페이스로 만듬
	abstract void checkOut (String borrower, String date);
	abstract void checkIn();
}
