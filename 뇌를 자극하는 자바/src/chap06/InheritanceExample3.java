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
			throw new Exception("������ �Ұ����մϴ�.");
		balance -= amount;
		return amount;
	}

}

public class InheritanceExample3 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-11111", "�輱��", 10000, 200000);
		try {
			int amount = obj.withdraw(50000);
			int balance = obj.disPlayBalance();
			System.out.println("�����:" + balance);
			int creditLine = obj.displayCreditLine();
			System.out.println("���̳ʽ� �ѵ�:"+ creditLine);
			System.out.println("�����:" + amount);
			/*System.out.println("�ܾ�:" + obj.balance);
			System.out.println("���̳ʽ� �ѵ�:" + obj.creditLine);*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
