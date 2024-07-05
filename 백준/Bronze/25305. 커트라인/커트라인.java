import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    // N명이 응시하고 k명이 상을 받을 때 상을 받는 커트라인 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 응시자 수
        int k = Integer.parseInt(st.nextToken()); // 수상자 수

        st = new StringTokenizer(br.readLine());
        List<Integer> scorelist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            scorelist.add(Integer.parseInt(st.nextToken())); // 각 학생의 점수
        }

        int cutlineScore = scorelist.stream().sorted().collect(Collectors.toList()).get(N-k);
        System.out.println(cutlineScore); // 상을 받는 커트라인
    }
}