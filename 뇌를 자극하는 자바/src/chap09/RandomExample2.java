package chap09;

import java.util.*;

public class RandomExample2 {
	public static void main(String args[]) {
		Date date = new Date();
		System.out.println(date.getTime());
		Random random = new Random(date.getTime());
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}
}
