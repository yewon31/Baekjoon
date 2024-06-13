import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int C = Integer.parseInt(br.readLine()); //거스름돈 C센트 (1<=C<=500)
			
			int[] arr = {25, 10, 5, 1}; //Quarter, Dime, Nickel, Penny
			int[] count = new int[4];
			for (int i = 0; i < arr.length; i++) {
				count[i] = C / arr[i];
				C %= arr[i];
			}
			System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3]);
		}
	}
}