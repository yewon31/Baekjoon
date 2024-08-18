import java.io.*;
import java.util.*;

public class Main {
    // M×N 크기의 보드를 잘라서 8x8 크기의 체스판으로 만들 때, 다시 칠해야 하는 정사각형의 최소 개수 출력
    public static void main(String[] args) throws IOException {

        /* [1] 입력 및 치환 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine(); // WBWBWBWB
            arr[i] = str.replaceAll("B", "1").replaceAll("W", "0"); // 검은색은 1로, 흰색은 0으로 치환
        }

        /* [2] 최솟값 찾기 */
        int cnt = 32; // 최댓값
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                cnt = Math.min(cnt, getCnt(arr, j, i, 0)); // 흰색으로 시작하는 체스판과 비교
                cnt = Math.min(cnt, getCnt(arr, j, i, 1)); // 검은색으로 시작하는 체스판과 비교
            }
        }
        System.out.println(cnt);
    }

    // arr 배열을(x열부터, y행부터) startNum으로 시작되는 체스판으로 만들기 위해 다시 칠해야 하는 정사각형 개수 반환
    public static int getCnt(String[] arr, int x, int y, int startNum) {
        int cnt = 0; // 다시 칠해야 하는 정사각형 개수
        for (int i = 0; i < 8; i++) {
            String chess = i % 2 == startNum ? "01010101" : "10101010";
            int xorResult = Integer.parseInt(chess, 2) ^ Integer.parseInt(arr[i + y].substring(x, x + 8), 2); // 비트 XOR 연산자
            cnt += Integer.bitCount(xorResult); // XOR 결과에서 1의 개수 누적
        }
        return cnt;
    }
}