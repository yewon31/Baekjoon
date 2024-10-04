import java.io.*;
import java.util.Stack;

public class Main {
    // 재민이가 최종적으로 적어 낸 수의 합 출력(2^31-1보다 작거나 같은 정수)
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); // (1 ≤ K ≤ 100,000)    
        Stack<Integer> stack = new Stack<>(); // 입력된 정수를 저장할 스택

        /* [2] 반복문 */
        while (K-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 정수(0 ≤ n ≤ 1,000,000)
            if (n == 0) stack.pop(); // 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
            else stack.push(n);
        }

        /* [3] 합 출력 */
        int sum = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.print(sum);
    }
}