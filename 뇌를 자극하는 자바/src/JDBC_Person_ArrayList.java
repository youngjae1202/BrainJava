
// ��Ű��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class Person {

	String jumincd = null;
	String pname = null;
	String gender = null;
	int age = 0;

	public Person() // �⺻ ������
	{
		this.jumincd = "�ֹι�ȣ �Է� ����";
		this.pname = "�̸� �Է� ����";
		this.gender = "���� �Է� ����";
		this.age = 0;
	}

	public String getJumincd() {
		return jumincd;
	}

	public void setJumincd(String jumincd) { // "800511-1574310"
		this.jumincd = jumincd;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class JDBC_Person_ArrayList {

	public static void main(String args[]) {

		// Person[] persons = new Person[3]; �迭 ��ü ����
		// Arraylist�� ����Ͽ� ������ �迭 ����
		ArrayList<Person> listperson = new ArrayList<Person>(3);

		////////////// JDBC ������� //////////////
		// 1�ܰ�: DB ������ ���� Ŀ�ؼ� �������̽�
		Connection conn = null;
		// Statement �������̽� - SQL ����.
		Statement stmt = null;
		// ResultSet �������̽� - SQL ����� ���� select �������� ���ȴ�
		ResultSet rs = null;

		// try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
		try {
			// String jumincd = null;
			// String pname = null;
			// String gender = null;
			int age = 0;
			// 2�ܰ�: JDBC����̹��� �ε��Ѵ�.
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ�: ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");

			// Ŀ�ؼ� ��ü�� Statement ��ü�� ����
			stmt = conn.createStatement();
			// DML SQL���� ������ ����� ����
			rs = stmt.executeQuery("select jumincd, pname,	gender, age  from person");

			System.out.println("�ֹι�ȣ         �̸�      ����    ����");
			while (rs.next()) {
				Person person;
				person = new Person();

				person.setJumincd(rs.getString(1));
				person.setPname(rs.getString(2));
				person.setGender(rs.getString(3));
				person.setAge(rs.getInt(4));
				listperson.add(person);

			} // 4�ܰ�: DB������ �����Ѵ�.
			conn.close();
			System.out.println("============================================================");
			for (int i = 0; i < listperson.size(); i++) {
				System.out.print(listperson.get(i).getJumincd()+"  ");
				System.out.print(listperson.get(i).getPname()+"  ");
				System.out.print(listperson.get(i).getGender()+"  ");
				System.out.print(listperson.get(i).getAge()+"  ");
				System.out.println();

			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			////////////// JDBC �������� //////////////
		}
	}
}
