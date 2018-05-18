package chap09;

public class StringTest2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
for(int i=1; i<100000; i++) {
			
		}
		String str = "산과 골짜기 위를";
		str += "둥실 떠가는";
		str += "구름처럼";
		System.out.println(str);
for(int i=1; i<100000; i++) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("실행 시간:" + (end - start)/1000.0);
	}

}
