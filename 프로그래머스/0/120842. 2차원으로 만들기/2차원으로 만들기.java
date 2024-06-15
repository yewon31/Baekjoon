import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] arr = new int[num_list.length / n][n];
        int idx = 0;
        for (int i = 0; i <= num_list.length - 1; i += n) {
            arr[idx++] = Arrays.copyOfRange(num_list, i, i + n);
        }
        return arr;
    }
}