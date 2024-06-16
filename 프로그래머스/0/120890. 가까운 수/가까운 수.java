import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int[] arr = Arrays.stream(array).distinct().sorted().toArray();
        int prevGap = Math.abs(n - arr[0]) + 1;
        for (int i = 0; i < arr.length; i++) {
            int gap = Math.abs(n - arr[i]);
            if (prevGap <= gap) return arr[i - 1];
            else if (i == arr.length - 1) return arr[i];
            prevGap = gap;
        }
        return 0;
    }
}