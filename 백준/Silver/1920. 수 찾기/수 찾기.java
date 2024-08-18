import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 여부 출력
    public static void main(String[] args) throws IOException {

        /* [1] 정수 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 정수의 개수 N(1 ≤ N ≤ 100,000)
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken()); // 정수(-2^31 ~ 2^31 - 1)
            set.add(num); // Set에 추가⭐
        }

        /* [2] 확인할 숫자 입력 및 확인 */
        int M = Integer.parseInt(br.readLine()); // 확인할 숫자의 개수 M(1 ≤ M ≤ 100,000)
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            sb.append((set.contains(num) ? 1 : 0) + "\n"); // 해당 숫자가 존재하면 1⭐
        }

        /* [3] 출력 */
        System.out.println(sb.toString());
    }
}