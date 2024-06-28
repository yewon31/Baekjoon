import java.io.*;
import java.util.*;

public class Main {
    // 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해 필요한 네 번째 점 반환
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xList = new ArrayList<>(); // x 좌표 {x1, x2, x3}
        List<Integer> yList = new ArrayList<>(); // y 좌표 {y1, y2, y3}
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (xList.contains(x)) xList.remove(Integer.valueOf(x)); // 2개가 되면 삭제
            else xList.add(x);
            if (yList.contains(y)) yList.remove(Integer.valueOf(y));
            else yList.add(y);
        }
        System.out.println(xList.get(0) + " " + yList.get(0));
    }
}