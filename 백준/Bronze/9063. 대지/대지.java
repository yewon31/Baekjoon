import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 점의 개수 N (1 ≤ N ≤ 100,000)

        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 각 점의 좌표 (-10,000 이상 10,000 이하 정수)
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            minX = Math.min(minX, x); maxX = Math.max(maxX, x);
            minY = Math.min(minY, y); maxY = Math.max(maxY, y);
        }

        int area = (maxX - minX) * (maxY - minY); // 넓이
        System.out.println(area);
    }
}