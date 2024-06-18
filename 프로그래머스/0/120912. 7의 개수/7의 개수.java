import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return Arrays.toString(array).replaceAll("[^7]", "").length();
    }
}