package chap09;
import java.util.StringTokenizer;
public class StringTokenizerExample1 {

	public static void main(String[] args) {

		StringTokenizer stok = new StringTokenizer("����ġ,�޹��� | �䳢",",| ");
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}

}
