import java.io.*;

public class Main {
    // 설탕 Nkg 배달 시 봉지(3/5kg)의 최소 개수 출력(불가능 시 -1)
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 설탕 Nkg (3 ≤ N ≤ 5000)

        /* [2] 계산 */
        int cnt = 0;
        cnt += N / 5;
        N %= 5;
        while (cnt > 0 && N % 3 != 0) {
            cnt--;
            N += 5;
        }
        cnt += N / 3;
        N %= 3;

        /* [3] 출력 */
        System.out.println(N == 0 ? cnt : -1);
    }
}