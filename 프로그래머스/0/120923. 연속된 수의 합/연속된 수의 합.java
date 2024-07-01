import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    // 연속된 수 num개를 더한 값이 total이 되는 정수 배열 반환
    public int[] solution(int num, int total) {
        int medianNum = total / num;
        int firstNum = medianNum - ((num + 1) / 2 - 1);
        return IntStream.iterate(firstNum, i -> i + 1).limit(num).toArray();
    }
}