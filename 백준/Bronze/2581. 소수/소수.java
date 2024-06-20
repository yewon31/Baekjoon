import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;

        //M 이상 N 이하의 자연수 중 소수
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                min = min == 0 ? i : min;
                sum += i;
            }
        }

        if(sum==0) {
            System.out.println(-1);
            return;
        }
        // 합계와 최솟값
        System.out.println(sum);
        System.out.println(min);
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) return false; // 약수가 있다면 소수x
        }
        return n==1 ? false : true;
    }
}