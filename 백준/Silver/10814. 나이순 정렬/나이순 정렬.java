import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 온라인 저지 회원의 수(1 ≤ N ≤ 100,000)
        String[][] arrList = new String[N][3]; // 가입순서, 나이, 이름 저장
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            arrList[i][0] = i + ""; // 가입순서
            arrList[i][1] = arr[0]; // 나이 : 1보다 크거나 같으며, 200보다 작거나 같은 정수
            arrList[i][2] = arr[1]; // 이름 : 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열
        }

        /* [2]정렬(나이 순 -> 가입한 순) */
        Arrays.sort(arrList, (a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));

        /* [3] 출력 */
        StringBuilder sb = new StringBuilder();
        for (String[] arr : arrList) {
            sb.append(arr[1] + " " + arr[2] + "\n");
        }
        System.out.println(sb.toString());
    }
}