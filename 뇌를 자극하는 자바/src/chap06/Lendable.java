package chap06;

public interface Lendable { //ù �������̽��� ����
	abstract void checkOut (String borrower, String date);
	abstract void checkIn();
}
