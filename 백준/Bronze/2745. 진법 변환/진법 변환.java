import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken(); //B진법 수 N
		int B = Integer.parseInt(st.nextToken()); //B진법 수 N //(2 ≤ B ≤ 36)

		int len = N.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			char ch = N.charAt(len-1-i);
			int num = 0;
			if(Character.isDigit(ch)) num = ch - '0'; //'1'은 1로, 'A'는 10으로
			else num = ch - 55; //'A'의 아스키 코드 : 65
			sum += num  * Math.pow(B, i);
		}
		System.out.println(sum); //B진법 수 N을 10진법으로 출력
	}
}