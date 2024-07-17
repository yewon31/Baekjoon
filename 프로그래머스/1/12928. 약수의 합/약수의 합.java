class Solution {
    // n의 약수를 모두 더한 값 반환 (0 <= n <= 3000)
    public int solution(int n) {
        int sum = n + 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += (i == n / i) ? i : (i + n / i);
            }

        }
        return n<2 ? n : sum;
    }
}