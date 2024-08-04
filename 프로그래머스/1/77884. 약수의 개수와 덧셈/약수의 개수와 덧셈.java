class Solution {
    // left~right 중에서 약수의 개수가 짝수인 수는 더하고, 홀수인 수는 뺀 수 반환
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += (countDivisors(i) % 2 == 0 ? i : -i);
        }
        return result;
    }

    // 약수의 개수 반환
    public int countDivisors(int num) {
        int cnt = 2; // 1과 자기 자신
        double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) { // 2부터 제곱근까지 반복
            if (num % i == 0) cnt += 2;
        }
        if (sqrt == Math.floor(sqrt)) cnt--; // 제곱근이 정수일 경우 중복되므로 개수 줄이기
        return num < 2 ? num : cnt;
    }
}