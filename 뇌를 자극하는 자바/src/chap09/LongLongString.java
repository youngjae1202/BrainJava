package chap09;

public class LongLongString {

	public static void main(String[] args) {
		
		for(String str : args) {
		StringBuilder sb = new StringBuilder();
		sb.append(args[0]);
		System.out.println(str);
		}
	}

}
