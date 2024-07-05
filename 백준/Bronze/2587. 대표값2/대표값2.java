import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(); // 선언
        for (int i = 0; i < 5; i++) list.add(Integer.parseInt(br.readLine())); // 입력
        list = list.stream().sorted().collect(Collectors.toList()); // 정렬
        System.out.println((int)list.stream().mapToInt(i -> i).average().getAsDouble()); // 평균
        System.out.println(list.get(2)); // 중앙값
    }
}