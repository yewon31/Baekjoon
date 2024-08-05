import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 1,000,000
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 절댓값이 1,000,000보다 작거나 같은 정수
        }
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}