import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // O(N^3)
    public static void main(String[] args) throws IOException {
        /*
        MenOfPassion(A[], n) {
            sum <- 0;
            for i <- 1 to n - 2
                for j <- i + 1 to n - 1
                    for k <- j + 1 to n
                        sum <- sum + A[i] × A[j] × A[k]; # 코드1
            return sum;
        }
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine()); // 1 ≤ n ≤ 500,000
        System.out.println((n * (n - 1) * (n - 2)) / 6); // 수행 횟수 - nC3 = n*n-1*n-2 / 3!
        System.out.println(3); // 최고차항의 차수
    }
}