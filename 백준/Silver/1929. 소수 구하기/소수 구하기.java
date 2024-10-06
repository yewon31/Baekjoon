import java.io.*;
import java.util.*;

public class Main {
    // M이상 N이하의 소수를 모두 출력하는 프로그램
    public static void main(String[] args) throws IOException {

        /* [1] 입력 처리 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]); // 범위의 시작값 M
        int N = Integer.parseInt(input[1]); // 범위의 끝값 N

        /* [2] 소수 여부 배열 설정✨ */
        boolean[] isNotPrime = new boolean[N + 1]; // 1~N 배열 생성 -> 기본값 false, 소수가 아니라면 true 대입
        isNotPrime[0] = isNotPrime[1] = true; // 0과 1은 소수가 아니다.

        // 에라토스테네스의 체: 소수가 되는 수의 배수를 지우면 소수만 남는다.
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!isNotPrime[i]) { // i는 소수
                for (int j = (i * i); j <= N; j += i) { // j는 i의 배수(i*i부터 검사)
                    isNotPrime[j] = true; // j는 소수가 아니다.
                }
            }
        }

        /* [3] 소수 출력 */
        StringBuffer sb = new StringBuffer();

        // M 이상 N 이하의 소수 찾기
        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) sb.append(i).append("\n");
        }

        // 최종 결과 출력
        System.out.println(sb);
    }
}
