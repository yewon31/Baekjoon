class Solution {
    // a와 b 사이에 속한 모든 정수의 합 반환
    public long solution(int a, int b) {
        double mid = (a + b) / 2.0;
        return (long) mid * (long) (Math.abs(a - b) + 1); // 중간값 x 개수
    }
}