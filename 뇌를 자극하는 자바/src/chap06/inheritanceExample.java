package chap06;
//���� Ŭ����
class Person{
	int money;
	public Person() {
		//�⺻ ������
		System.out.println("�θ� Ŭ������ �⺻������ Person() ȣ��");
		this.money = 300000000;
	}
	public Person(int money) {
		this.money = money;
		System.out.println("�θ�Ŭ������  Person(int money)������ ȣ��");
	}
	public int displaymoney() {
		System.out.println("���:"+ money );
		return money;
	}
}

//���� Ŭ����
class Child extends Person{
	public Child() {
		System.out.println("�ڽ�Ŭ������ �⺻ ������ child() ȣ��");
		super.displaymoney();
	}
}



public class inheritanceExample {

	public static void main(String[] args) {
		

		Person person = new Person(1000000000);
		System.out.println("���:"+person.money);
		Child child = new Child();
		child.displaymoney();
		System.out.println(child.money);
	/*	System.out.println(child.money);*/
	}

}
