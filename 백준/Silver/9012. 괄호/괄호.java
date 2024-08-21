import java.io.*;
import java.util.Stack;

public class Main {
    // 각 줄마다 괄호가 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* [1] 입력 */
        int T = Integer.parseInt(br.readLine()); // 입력 데이터 수
        while (T-- > 0) {
            String str = br.readLine(); // ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열(길이는 2 이상 50 이하)
            /* [2] 올바른 괄호 문자열 판단 */
            Stack<Character> stack = new Stack<>(); //✨
            boolean isBalanced = true; // 플래그
            for (char c : str.toCharArray()) {
                if (c == '[' || c == '(') stack.push(c); // 여는 괄호 push✨
                else if ((c == ']') || (c == ')')) { // 닫는 괄호
                    if (stack.isEmpty() || ((c == ']' && stack.peek() != '[')
                            || (c == ')' && stack.peek() != '('))) { // 스택이 비어있거나 짝이 맞지 않으면
                        isBalanced = false; // 불균형 1
                        break;
                    }
                    stack.pop(); // 짝이 맞는 경우 스택에서 제거✨
                }
            }

            if (!stack.isEmpty()) isBalanced = false; // 불균형 2
            sb.append(isBalanced ? "YES" : "NO").append("\n");
        }

        /* [3] 출력 */
        System.out.println(sb.toString());
    }
}