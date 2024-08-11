import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 2차원 평면 위 점의 개수 N (1 ≤ N ≤ 100,000)
        
        // 점들을 저장할 리스트
        List<int[]> points = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String[] xy = br.readLine().split(" "); // i번점의 위치 xi와 yi(-100,000 ≤ xi, yi ≤ 100,000)
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            points.add(new int[] {x, y});
        }
        
        /* [2] 정렬 */
        points.sort((p1, p2) -> {
            if (p1[0] == p2[0]) {
                return Integer.compare(p1[1], p2[1]); // x좌표가 같으면 y좌표를 기준으로 오름차순 정렬
            } else {
                return Integer.compare(p1[0], p2[0]); // x좌표 기준 오름차순 정렬
            }
        });
        
        /* [3] 출력 */
        StringBuilder sb = new StringBuilder();
        for (int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}