package chap06;

class Account {
	String accountNo;
	String ownerName;
	int balance;

	public Account(String accountNo,String ownerName,int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public int disPlayBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}
}

class CheckingAccount extends Account {
	String cardNO;

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNO) {
		
		super(accountNo,ownerName,balance);
		
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNO = cardNO;
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNO.equals(this.cardNO))
			throw new Exception("계좌번호가 틀립니다.");
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		return withdraw(amount);
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {

		CheckingAccount obj = new CheckingAccount("111-22-3333333", "홍길동", 100000, "5555-6666-7777-8888");

		// CheckingAccount obj = new CheckingAccount();

		/*
		 * obj.accountNo = "111-22-3333333"; obj.ownerName = "홍길동"; obj.cardNO =
		 * "5555-6666-7777-8888"; obj.deposit(100000);
		 */
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 50000);
			System.out.println("지불액:" + paidAmount);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {
			System.out.println(e.hashCode());
			System.out.println(e);
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
