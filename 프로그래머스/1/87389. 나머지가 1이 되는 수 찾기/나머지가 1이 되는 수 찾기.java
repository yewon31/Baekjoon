class Solution {
    // n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x 반환
    public int solution(int n) {
        // (n-1)의 약수 중 가장 작은 수
        for (int i = 2; i <= Math.sqrt(n - 1); i++) {
            if ((n - 1) % i == 0) return i;
        }
        return n - 1;
    }
}