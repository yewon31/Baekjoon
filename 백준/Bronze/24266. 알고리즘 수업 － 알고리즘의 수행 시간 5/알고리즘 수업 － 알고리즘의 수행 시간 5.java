import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // O(N^3)
    public static void main(String[] args) throws IOException {
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine()); // int 표현 범위 : -2,147,483,648~2,147,483,647
        System.out.println(n * n * n); // 수행 횟수 - 삼중 반복문 반복 횟수
        System.out.println(3); // 최고차항의 차수
    }
}