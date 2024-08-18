import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // N이 주어졌을 때, 제일 마지막에 남게 되는 카드 번호 출력
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 카드 장수 N(1 ≤ N ≤ 500,000)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        /* [2] 반복 */
        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        /* [3] 출력 */
        System.out.println(queue.poll());
    }
}