package chap06;

class BonusPointAccount extends Account{
	int bonusPoint;
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	@Override
	public void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}
}

public class InheritanceExample4 {

	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("333-33-3333", "��̿�",0, 0);
		obj.deposit(1000000);
		System.out.println("�ܾ�"+obj.balance);
		System.out.println("��������Ʈ" + obj.bonusPoint);
	}

}
