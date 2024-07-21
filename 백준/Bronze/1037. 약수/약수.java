import java.io.*;
import java.util.*;

public class Main {
    // 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()); // N의 진짜 약수의 개수(50보다 작거나 같은 자연수)

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (cnt-- > 0) {
            list.add(Integer.parseInt(st.nextToken())); // N의 진짜 약수 차례대로 대입
        }

        int min = list.stream().mapToInt(i -> i).min().getAsInt();
        int max = list.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println(min * max); // N의 약수중 가장 작은 값 * 가장 큰 값
    }
}