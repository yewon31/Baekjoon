import java.util.Arrays;

class Solution {
    // 정수를 담고 있는 배열 arr의 평균값 반환
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}