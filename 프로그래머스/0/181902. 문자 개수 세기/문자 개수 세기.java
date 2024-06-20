import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52];
        int idx = 0;
        for (int c = 'A'; c <= 'z'; c++) {
            arr[idx++] = my_string.replaceAll("[^" + (char) c++ + "]", "").length();
            if (--c == 'Z') c = 'a' - 1;
        }
        return arr;
    }
}