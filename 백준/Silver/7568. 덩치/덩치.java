import java.io.*;
import java.util.*;

public class Main {
    // 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, int[]> map = new LinkedHashMap<>();
        int idx = 0;
        /* 몸무게, 키 저장 */
        while (idx++ < N) {
            String[] arr = br.readLine().split(" ");
            map.put(idx, new int[]{Integer.parseInt(arr[0]), Integer.parseInt(arr[1])}); // 몸무게, 키
        }
        /* 덩치 등수 구하기 */
        List<String> list = new ArrayList<>(); // 간편하게 String.join 하기 위해 String으로 저장
        for (int[] data : map.values()) {
            long cnt = map.values().stream().filter(i -> i[0] > data[0] && i[1] > data[1]).count() + 1;
            list.add(cnt + "");
        }
        System.out.println(String.join(" ", list)); // 덩치 등수 순서대로 출력
    }
}