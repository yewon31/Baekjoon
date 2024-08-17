import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
    // 영단어 배열과 원하는 단어 배열이 주어질 때, 영단어를 순서대로 사용하여 원하는 단어 배열을 만들 수 있는지 반환
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
        for (String word : goal) {
            if (queue1.peek() != null && queue1.peek().equals(word)) queue1.poll();
            else if (queue2.peek() != null && queue2.peek().equals(word)) queue2.poll();
            else return "No";
        }
        return "Yes";
    }
}