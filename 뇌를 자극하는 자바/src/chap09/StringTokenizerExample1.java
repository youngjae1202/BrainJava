package chap09;
import java.util.StringTokenizer;
public class StringTokenizerExample1 {

	public static void main(String[] args) {

		StringTokenizer stok = new StringTokenizer("°í½¿µµÄ¡,¾Þ¹«»õ | Åä³¢",",| ");
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}

}
