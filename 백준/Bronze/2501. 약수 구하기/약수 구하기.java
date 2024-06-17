import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        /****** 입력 ******/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //1 이상 10,000 이하
        int K = Integer.parseInt(st.nextToken()); //1 이상 N 이하
        /****** 계산 ******/
        int answer = 0; //N의 약수들 중 K번째로 작은 수
        int cnt = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                cnt++;
                if (K == cnt) {
                    answer = i;
                    break;
                }
            }
            if (i == N / 2 && K == ++cnt) answer = N;
        }
        /****** 출력 ******/
        System.out.println(answer);
    }
}