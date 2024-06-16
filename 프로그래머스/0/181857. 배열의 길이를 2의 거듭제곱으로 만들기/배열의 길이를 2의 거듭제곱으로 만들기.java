import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int cnt = 1;
        while (cnt < len) {
            cnt *= 2;
        }
        int[] newArr = Arrays.copyOfRange(arr, 0, cnt);
        return newArr;
    }
}