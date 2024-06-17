import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int minGap = Arrays.stream(array)
                            .map(value -> Math.abs(n - value))
                            .min()
                            .orElse(Integer.MIN_VALUE); //Optional 객체가 비어있으면 기본값, 비어있지않으면 Optional 객체의 값 추출
        return (Arrays.stream(array).anyMatch(value -> value == n - minGap)) ? n - minGap : n + minGap;
    }
}