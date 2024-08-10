import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 온라인 저지 회원의 수(1 ≤ N ≤ 100,000)
        StringBuilder[] memberList = new StringBuilder[201];
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            int age = Integer.parseInt(arr[0]); // 나이 : 1보다 크거나 같으며, 200보다 작거나 같은 정수
            String name = arr[1]; // 이름 : 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열
            if (memberList[age] == null) memberList[age] = new StringBuilder();
            memberList[age].append(age + " " + name + "\n");
        }

        /* [2] 출력 */
        StringBuilder sbList = new StringBuilder();
        for (StringBuilder sb : memberList) {
            if (sb != null) sbList.append(sb.toString());
        }
        System.out.println(sbList.toString());
    }
}