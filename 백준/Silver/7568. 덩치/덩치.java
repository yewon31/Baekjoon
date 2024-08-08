import java.io.*;
import java.util.*;

public class Main {
    // 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dataList = new int[N][2];
        /* 몸무게, 키 저장 */
        for (int idx = 0; idx < N; idx++) {
            String[] arr = br.readLine().split(" ");
            dataList[idx][0] = Integer.parseInt(arr[0]);
            dataList[idx][1] = Integer.parseInt(arr[1]);
        }
        /* 덩치 등수 구하기 */
        StringBuilder sb = new StringBuilder();
        for (int[] data : dataList) {
            long rank = Arrays.stream(dataList).filter(i -> i[0] > data[0] && i[1] > data[1]).count() + 1;
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}