import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // N!은 곱의 계산이기 때문에 0의 개수는 결국 10이 몇번 곱해졌는지 세는 것이다.
        // 10은 2와 5의 곱으로 이루어지기 때문에 소인수 분해를 통해 2*5 개수를 찾는다.
        // 2의 개수는 어차피 항상 5의 개수보다 많기 때문에 5의 개수만 카운트한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 0 ≤ N ≤ 500
        int cnt = 0;
        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }
        System.out.print(cnt);
    }
}