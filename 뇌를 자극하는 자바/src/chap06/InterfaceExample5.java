package chap06;

public class InterfaceExample5 {

	public static void main(String[] args) {
		Label obj = new Label("�ȳ��ϼ���" , 100, 30,"yellow","green","����ü");
		printLabel(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("�ü�ü");
		printLabel(obj);
	}
	static void printLabel(Label obj) {
		System.out.printf(
				"%s: %d x %d ����(%s) �����(%s) ��Ʈ(%s) %n",
				obj.text, obj.width, obj.height,
				obj.background, obj.foreground, obj.font);
	}

}
