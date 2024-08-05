import java.util.Scanner;

class Solution {
    // 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("*".repeat(n));
        }
    }
}