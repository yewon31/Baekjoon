import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // (N, K)-요세푸스 순열 출력(원에서 사람들이 제거되는 순서)
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 사람의 수 N
        int K = Integer.parseInt(st.nextToken()); // 제거될 순서 K

        /* [2] 큐 생성 후 값 채우기 */
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        /* [3] K번째 사람 제거 */
        List<Integer> list = new ArrayList<>(); // 제거된 사람들 저장(요세푸스 순열)
        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll()); // K번째 전까지의 사람들을 큐의 뒤로 보냄
            }
            list.add(queue.poll()); // K번째 사람을 제거하고 리스트에 추가
        }

        /* [4] 결과 출력 */
        String str = list.stream()
                .map(String::valueOf) // String 변환
                .collect(Collectors.joining(", ")); // ","로 구분하여 문자열로 결합
        System.out.println("<" + str + ">"); // 최종 요세푸스 순열 출력
    }
}