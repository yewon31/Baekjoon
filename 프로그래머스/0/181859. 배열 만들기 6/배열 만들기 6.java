import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.empty() || stack.peek() != arr[i]) stack.push(arr[i]);
            else stack.pop();
        }
        return stack.empty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}