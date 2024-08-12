import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 2차원 평면 위 점의 개수 N (1 ≤ N ≤ 100,000)
        int[][] arrList = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrList[i][0] = Integer.parseInt(st.nextToken());
            arrList[i][1] = Integer.parseInt(st.nextToken());
        }

        /* [2] 정렬 */
        Arrays.sort(arrList, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
        // (int[] a) -> a[0] 이 람다식은 배열 arr의 각 요소(즉, int[])를 받아서 그 배열의 첫 번째 요소(a[0])를 반환합니다. 따라서 arr의 요소들은 a[0]에 따라 정렬됩니다.
        // .thenComparingInt(a -> a[1]): 이 부분은 추가적인 정렬 기준을 지정합니다. 
        // thenComparingInt 메서드는 첫 번째 정렬 기준(즉, a[0])이 동일한 경우에 두 번째 기준(즉, a[1])을 사용하여 정렬을 수행합니다.
        // a -> a[1] 이 람다식은 배열 a를 받아서 그 배열의 두 번째 요소(a[1])를 반환합니다. 여기서 a의 타입은 생략되었지만, 자바의 타입 추론에 의해 int[]로 인식됩니다.

        /* [3] 출력 */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arrList[i][0] + " " + arrList[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}