package chap09;

public class StringTest1 {

	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i=1; i<100000; i++) {
			
		}
		String str = "아름다운 이 땅에 금수강산에 단군 할아버지가 터 잡으시고" +
				"홍익인간 뜻으로 나라 세우니 대대손손 훌륭한 인물도 많아" +
				"고구려 세운 동명왕 백제 온조왕 알에서 나온 혁거세"+
				"만주 벌판 달려라 광개토대왕 신라 장군 이사부"+
				"백결선생 떡 방아 삼천 궁녀 의자왕"+
				"황산벌의 계백 맞서 싸운 관창 역사는 흐른다";
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println("실행 시간:" + (end - start)/1000.0);
	}

}