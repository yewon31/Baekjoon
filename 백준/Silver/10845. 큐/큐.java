import java.io.*;
import java.util.*;

public class Main {
    // 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수 N (1 ≤ N ≤ 10,000)
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        /* 반복문(명령 처리) */
        while (N-- > 0) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.offer(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1" : ((LinkedList<Integer>) queue).peekLast()).append("\n");
            } // switch
        } // while

        System.out.println(sb);
    }
}
