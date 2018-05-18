package chap09;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("역사를 하노라고 맨 땅을 파다가");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.append("커다란 고인돌은 끄집어 내어놓고 보니"));
		System.out.println(sb.insert(26,"하나"));
		System.out.println(sb.delete(21, 23));
		System.out.println(sb.deleteCharAt(9));
		sb.trimToSize();
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
