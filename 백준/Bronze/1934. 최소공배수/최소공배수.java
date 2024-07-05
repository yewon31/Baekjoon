import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    // A와 B의 최소공배수를 구하는 프로그램
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a * b / gcd(a, b)); // 최소공배수
        }
    }

    public static int gcd(int a, int b) { // 최대공약수
        return a % b == 0 ? b : gcd(b, a % b); // 나눈수를 나머지로 나누기
    }

}