import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//�Ϲ����� �迭�� ������ �߻�
		/*String[] fruits = new String[3];
		fruits[0] ="����";
		fruits[1] ="����";
		fruits[2] ="������";
		fruits[3] ="�ٳ���";
		*/
		
		ArrayList<String> fruits = new ArrayList<String>(3);
		fruits.add("����");
		fruits.add("����");
		fruits.add("������");
		fruits.add("�ٳ���");
		int num = fruits.size();
		System.out.println("���� ���");
		//�� ��� get�� ���
		/*System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));*/
		//for���� �̿��� �ݺ��� get ���
		for(int cnt = 0; cnt<num; cnt++) {
			String str = fruits.get(cnt);
			System.out.println(str);
		}
	}

}
