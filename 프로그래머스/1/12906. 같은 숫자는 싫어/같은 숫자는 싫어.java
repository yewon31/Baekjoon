import java.util.*;

public class Solution {
    // arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}