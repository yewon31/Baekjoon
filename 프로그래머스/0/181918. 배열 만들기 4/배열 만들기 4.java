import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stack.empty()) stack.add(arr[i++]);
            else if (stack.peek() < arr[i]) stack.add(arr[i++]);
            else stack.pop();
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}