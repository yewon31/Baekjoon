import java.io.*;

public class Main {
    // N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. (0보다 크고, 180보다 작은 정수)
        int angleA = Integer.parseInt(br.readLine());
        int angleB = Integer.parseInt(br.readLine());
        int angleC = Integer.parseInt(br.readLine());

        // 문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
        String answer = "";
        if (angleA == 60 && angleB == 60 && angleC == 60) answer = "Equilateral";
        else if (angleA + angleB + angleC == 180) {
            if (angleA == angleB || angleB == angleC || angleA == angleC) answer = "Isosceles"; // 두 각이 같은 경우
            else answer = "Scalene";
        } else answer = "Error";
        System.out.println(answer);
    }
}