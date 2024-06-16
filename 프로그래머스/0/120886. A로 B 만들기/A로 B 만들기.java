import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] arrA = before.split("");
        String[] arrB = after.split("");
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB) ? 1 : 0;
    }
}