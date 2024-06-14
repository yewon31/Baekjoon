import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result = factorial(n) / (factorial(k) * factorial(n-k));
		System.out.println(result);
	}
	
	static int factorial(int num) {
		return num<2 ? 1 : num * factorial(num-1);
	}
}
