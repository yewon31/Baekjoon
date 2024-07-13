class Solution {
    // n이 양의 정수 x의 제곱이라면 x+1의 제곱 반환
    public long solution(long n) {
        double x = Math.sqrt(n);
        if (x == (int) x) return ((long) x + 1) * ((long) x + 1);
        return -1;
    }
}