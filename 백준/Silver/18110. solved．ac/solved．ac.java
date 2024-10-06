import java.io.*;
import java.util.*;

public class Main {
    // 사용자들이 어떤 문제에 제출한 난이도 의견 목록이 주어질 때, solved.ac가 결정한 문제의 난이도를 계산하는 프로그램
    public static void main(String[] args) throws IOException {

        /* [1] 입력 처리 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 난이도 의견의 개수 n (0 ≤ n ≤ 3 × 105)

        // 난이도 의견이 0개일 경우 바로 0 출력
        if (n == 0) {
            System.out.println(0); return;
        }

        // 난이도 의견들을 저장할 리스트
        int[] difficulties = new int[n];

        // 난이도 의견 입력 받기(1 이상 30 이하)
        for (int i = 0; i < n; i++) {
            difficulties[i] = Integer.parseInt(br.readLine());
        } // while

        /* [2] 30% 절사평균 계산 */
        // 난이도 의견 배열을 오름차순으로 정렬
        Arrays.sort(difficulties);

        // 상위, 하위 15%의 의견 개수 계산 (반올림 처리)
        int trimCount = (int) Math.round(n * 0.15);

        // 상위, 하위 trimCount 개수 제외한 의견들의 합을 계산
        int sum = 0;
        for (int i = trimCount; i < n - trimCount; i++) {
            sum += difficulties[i];
        }

        // 유효한 의견의 개수 (전체에서 상하위 15%씩 제외한 나머지)
        int validCount = n - 2 * trimCount;

        // 절사평균 계산 (소수점 반올림)
        int result = (int) Math.round((double) sum / validCount);

        /* [3] 결과 출력 */
        System.out.println(result);
    }
}
