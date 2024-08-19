import java.io.*;

public class Main {
    // 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine(); // 영문, 공백, 소괄호, 대괄호로 이루어져 있으며, 온점으로 끝나고, 길이는 100글자보다 작거나 같다.
            if (str.equals(".")) break;
            str = str.replaceAll("[^\\[\\]\\(\\)]", ""); // 괄호가 아닌 문자 제거
            while (str.contains("()") || str.contains("[]")) {
                str = str.replaceAll("(\\[\\])|(\\(\\))", ""); // [] or () 제거
            }
            sb.append((str.isBlank() ? "yes" : "no") + "\n");
        }

        /* [2] 출력 */
        System.out.println(sb.toString());
    }
}