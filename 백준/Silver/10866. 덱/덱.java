import java.io.*;
import java.util.*;

public class Main {
    // 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수 N (1 ≤ N ≤ 10,000)
        Deque<Integer> deque = new ArrayDeque<>(); // 덱 생성 (ArrayDeque)
        StringBuilder sb = new StringBuilder();

        /* 반복문(명령 처리)✨ */
        while (N-- > 0) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push_front":
                    deque.offerFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
                    break;
            } // switch
        } // while

        System.out.println(sb);
    }
}
