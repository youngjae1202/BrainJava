import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//일반적인 배열은 오류가 발생
		/*String[] fruits = new String[3];
		fruits[0] ="포도";
		fruits[1] ="딸기";
		fruits[2] ="복숭아";
		fruits[3] ="바나나";
		*/
		
		ArrayList<String> fruits = new ArrayList<String>(3);
		fruits.add("포도");
		fruits.add("딸기");
		fruits.add("복숭아");
		fruits.add("바나나");
		int num = fruits.size();
		System.out.println("과일 출력");
		//값 출력 get을 사용
		/*System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));*/
		//for문을 이용한 반복문 get 출력
		for(int cnt = 0; cnt<num; cnt++) {
			String str = fruits.get(cnt);
			System.out.println(str);
		}
	}

}
