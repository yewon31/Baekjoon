import java.io.*;
import java.util.Stack;

public class Main {
    // 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            /* [1] 입력 */
            String str = br.readLine(); // 영문, 공백, 소괄호, 대괄호로 이루어져 있으며, 온점으로 끝나고, 길이는 100글자보다 작거나 같다.
            if (str.equals(".")) break;
            /* [2] 짝 맞는 괄호 제거 */
            Stack<Character> stack = new Stack<>();
            String result = "yes";
            for (char c : str.toCharArray()) {
                if (c == '[' || c == '(') stack.push(c); // 여는 괄호 push
                else if ((c == ']') || (c == ')')) { // 닫는 괄호
                    if (!stack.isEmpty() && ((c == ']' && stack.peek() == '[')
                            || (c == ')' && stack.peek() == '('))) { // 비어있지 않고 짝이 있으면
                        stack.pop();
                    } else { // 비어있거나 짝이 없으면
                        result = "no";
                        break;
                    }
                }
            }

            sb.append((stack.isEmpty() ? result : "no") + "\n");
        }

        /* [3] 출력 */
        System.out.println(sb.toString());
    }
}