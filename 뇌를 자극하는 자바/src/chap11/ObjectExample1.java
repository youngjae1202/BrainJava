package chap11;

import java.io.File;

public class ObjectExample1 {

	public static void main(String[] args) {
		File file = new File("D:\\test\\���ٱ�.txt");
		String str = file.toString();
		System.out.println(str);
	}

}
