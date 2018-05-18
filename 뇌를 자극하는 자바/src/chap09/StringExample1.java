package chap09;

public class StringExample1 {

	public static void main(String[] args) {
		String str = "자바 커피";
		int len = str.length();
		for(int cnt = 0; cnt<len; cnt++) {
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
		
		//안에 내용은 같으나 id값이 다르기때문에 다름이 나옴
		/*String str1 = new String("Hello, Java");
		String str2 = new String("Hello, Java");
		String str3 = new String("Hello, Java");*/
		
		//같은곳을 바라 보고있기 때문에 같다가 나옴
		String str1 ="hello , java";
		String str2 ="hello , java";
		String str3 ="hello , java";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		if(str1.equals(str2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다름");
		}
	}

}
