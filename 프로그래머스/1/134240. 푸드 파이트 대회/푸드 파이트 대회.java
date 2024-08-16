import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

class Solution {
    // 음식의 양이 칼로리가 적은 순서대로 주어졌을 때, 음식의 배치를 나타내는 문자열 반환
    public String solution(int[] food) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(0); // 물 배치
        for (int i = food.length - 1; i > 0; i--) { // 칼로리가 많은 음식부터 안쪽에 배치
            int amount = food[i];
            for (int j = 0; j < amount / 2; j++) {
                deque.offerFirst(i); // 왼쪽 끝에 배치
                deque.offerLast(i); // 오른쪽 끝에 배치
            }
        }
        return deque.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}