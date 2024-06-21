import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if(stack.empty() || stack.peek() != num) stack.push(num);
            else stack.pop();
        }
        return stack.empty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}