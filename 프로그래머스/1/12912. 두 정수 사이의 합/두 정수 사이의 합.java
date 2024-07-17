class Solution {
    // a와 b 사이에 속한 모든 정수의 합 반환
    public long solution(int a, int b) {
        return ((long)a + b) * (Math.abs(a - b) + 1) / 2;
    }
}