package chap06;

//Account

//CreditLineAccount
class CreditLineAccount extends Account {
	int creditLine;

	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	public int displayCreditLine() {
		return creditLine;
	}

	public int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return amount;
	}

}

public class InheritanceExample3 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-11111", "김선달", 10000, 200000);
		try {
			int amount = obj.withdraw(50000);
			int balance = obj.disPlayBalance();
			System.out.println("인출액:" + balance);
			int creditLine = obj.displayCreditLine();
			System.out.println("마이너스 한도:"+ creditLine);
			System.out.println("인출액:" + amount);
			/*System.out.println("잔액:" + obj.balance);
			System.out.println("마이너스 한도:" + obj.creditLine);*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
