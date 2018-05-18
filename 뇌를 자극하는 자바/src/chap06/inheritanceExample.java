package chap06;
//슈퍼 클래스
class Person{
	int money;
	public Person() {
		//기본 생성자
		System.out.println("부모 클래스에 기본생성자 Person() 호출");
		this.money = 300000000;
	}
	public Person(int money) {
		this.money = money;
		System.out.println("부모클래스에  Person(int money)생성자 호출");
	}
	public int displaymoney() {
		System.out.println("재산:"+ money );
		return money;
	}
}

//서브 클래스
class Child extends Person{
	public Child() {
		System.out.println("자식클래스에 기본 생성자 child() 호출");
		super.displaymoney();
	}
}



public class inheritanceExample {

	public static void main(String[] args) {
		

		Person person = new Person(1000000000);
		System.out.println("재산:"+person.money);
		Child child = new Child();
		child.displaymoney();
		System.out.println(child.money);
	/*	System.out.println(child.money);*/
	}

}
