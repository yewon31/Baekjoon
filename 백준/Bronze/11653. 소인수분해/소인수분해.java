import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // N의 소인수분해 결과 출력(약수 중 소수들의 곱)
    public static void main(String[] args) throws IOException {
        /****** 입력 ******/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /****** 반복문 ******/
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N > 1) System.out.println(N);
    }
}