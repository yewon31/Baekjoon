import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /****** 입력 ******/
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            /****** 약수 구하기 ******/
            Set<Integer> set = new TreeSet<>();
            for (int i = 2; i <= Math.sqrt(n); i++) { //1과 자기 자신 제외, n의 제곱근까지만 반복
                if (n % i == 0) { //약수
                    set.add(i);
                    set.add(n / i);
                }
            }
            /****** 완전수 판단 ******/
            int sum = 1;
            String str = "1";
            for (int value : set) {
                sum += value;
                str += " + " + value;
            }
            String answer = (n == sum) ? n + " = " + str : n + " is NOT perfect.";
            /****** 출력 ******/
            System.out.println(answer);
        }
    }
}