import java.util.Arrays;

class Solution {
    // 등차/등비수열이 주어질 때, 마지막 원소 다음으로 올 숫자 반환
    public int solution(int[] common) {
        int len = common.length;
        int a = common[len - 1];
        int b = common[len - 2];
        int c = common[len - 3];
        int gapA = a - b;
        int gapB = b - c;
        if (gapA == gapB) return a + gapA; // 등차수열
        else return a * (gapA / gapB); // 등비수열
    }
}