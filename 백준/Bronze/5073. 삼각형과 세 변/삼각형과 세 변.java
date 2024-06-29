import java.io.*;
import java.util.*;

public class Main {
    // 삼각형의 세 변의 길이를 입력받고 조건에 따라 메시지 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!(line = br.readLine()).equals("0 0 0")) {
            // [1] 삼각형의 세 변의 길이 입력 (1,000을 넘지 않는 양의 정수)
            StringTokenizer st = new StringTokenizer(line);
            int lenArr[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            // [2] 중복값 개수 판단을 위해 set 저장
            Set<Integer> set = new HashSet<>();
            for (int value : lenArr) set.add(value);
            // [3] 조건에 따라 메시지 출력
            String answer = "";
            Arrays.sort(lenArr);
            if (lenArr[2] < lenArr[0] + lenArr[1]) { // ‘두 변의 길이 합’은 ‘가장 긴 변의 길이’보다 커야 함
                if (set.size() == 1) answer = "Equilateral";
                else if (set.size() == 2) answer = "Isosceles";
                else answer = "Scalene";
            } else answer = "Invalid";
            System.out.println(answer);
        }
    }
}