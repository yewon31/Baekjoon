import java.io.*;
import java.util.*;

public class Main {
    // 세 막대의 길이가 주어졌을 때, 만들 수 있는 가장 큰 삼각형의 둘레 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각 막대 길이 입력 (1 ≤ x ≤ 100)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lenArr[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        // 삼각부등식을 성립할 수 있도록 가장 긴 막대 길이 조정
        Arrays.sort(lenArr);
        lenArr[2] = Math.min(lenArr[2], lenArr[0] + lenArr[1] - 1); // ‘가장 긴 변의 길이’는 나머지 두 변의 길이의 합보다 작아야 함
        // 만들 수 있는 가장 큰 삼각형의 둘레 출력
        int maxPerimeter = Arrays.stream(lenArr).sum();
        System.out.println(maxPerimeter);
    }
}