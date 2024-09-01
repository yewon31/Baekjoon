import java.io.*;
import java.util.Stack;

public class Main {
    // 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수 N

        /* [2] 스택과 StringBuilder 초기화 */
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        /* [3] 명령어 처리 반복문 */
        while (N-- > 0) {
            String[] arr = br.readLine().split(" "); // 명령
            switch (arr[0]) {
                case "push":
                    stack.push(Integer.parseInt(arr[1])); // 스택에 정수 push
                    break;
                case "pop":
                    sb.append(stack.isEmpty() ? "-1" : stack.pop()).append("\n"); // 스택에서 pop하고 출력
                    break;
                case "size":
                    sb.append(stack.size() + "\n"); // 스택의 크기 출력
                    break;
                case "empty":
                    sb.append((stack.isEmpty() ? "1" : "0") + "\n"); // 스택이 비어있는지 확인 후 출력
                    break;
                case "top":
                    sb.append((stack.isEmpty() ? -1 : stack.peek()) + "\n"); // 스택의 top 요소 출력
            }
        }

        /* [3] 출력 */
        System.out.print(sb);
    }
}