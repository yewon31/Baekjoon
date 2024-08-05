import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수(666, 1666, 2666, 3666...)
        // N번째로 작은 종말의 수 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 10,000보다 작거나 같은 자연수
        int cnt = 0, num = 0;
        while (cnt < N) {
            if ((++num + "").contains("666")) cnt++;
        }
        System.out.print(num);
    }
}