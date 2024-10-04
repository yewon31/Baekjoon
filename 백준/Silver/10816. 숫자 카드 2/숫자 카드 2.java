import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    // M개의 수에 대해서, 각 수가 적힌 숫자 카드를 몇 개 가지고 있는지 공백으로 구분해 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /* [1] 숫자 카드 개수 N(1 ≤ N ≤ 500,000) */
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cardCount = new HashMap<>();
        
        /* [2] 숫자 카드에 적혀있는 정수(-10,000,000 ≤ x ≤ 10,000,000) */
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 각 숫자의 개수를 해시맵에 저장✨
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }
        
        /* [3] 정수 개수 M(1 ≤ M ≤ 500,000) */
        int M = Integer.parseInt(br.readLine());
        
        /* [4] 몇 개를 가지고 있는 숫자 카드인지 구해야 할 M개의 정수(-10,000,000 ≤ x ≤ 10,000,000) */
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            // 해시맵에서 해당 숫자가 몇 개 있는지 바로 가져옴✨
            sb.append(cardCount.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
