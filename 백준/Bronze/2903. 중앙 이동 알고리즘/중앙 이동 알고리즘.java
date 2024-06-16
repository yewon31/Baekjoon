import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int dot = 2; //한 변의 점 개수
        int cnt = 0;
        while (cnt < N) {
            dot += Math.pow(2, cnt++); //1, 2, 4, 8
        }
        System.out.println( dot * dot); //한 변의 점 개수 ^ 2
    }
}