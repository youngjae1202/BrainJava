package chap09;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("���縦 �ϳ��� �� ���� �Ĵٰ�");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.append("Ŀ�ٶ� ���ε��� ������ ������� ����"));
		System.out.println(sb.insert(26,"�ϳ�"));
		System.out.println(sb.delete(21, 23));
		System.out.println(sb.deleteCharAt(9));
		sb.trimToSize();
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
