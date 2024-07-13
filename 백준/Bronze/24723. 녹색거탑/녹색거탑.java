import java.io.*;

public class Main {
    // 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(2, N)); // 2의 N제곱
    }
}