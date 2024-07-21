import java.io.*;
import java.util.*;

public class Main {
    // N!을 출력하는 프로그램
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // (0 ≤ N ≤ 20)
        long result = 1;
        while (N > 0) result *= N--;
        System.out.println(result);
    }
}