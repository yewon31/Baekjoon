import java.util.Arrays;

class Solution {
    // 두 분수를 더한 값을 기약 분수로 나타냈을 때의 분자와 분모를 담은 배열 반환
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모를 최소공배수로 맞춰주기 위해 분자값 조정
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        numer1 *= lcm / denom1;
        numer2 *= lcm / denom2;
        // 분수 더하기
        int numerSum = numer1 + numer2;
        int denomSum = lcm;
        // 기약분수로 나타내기(최대 공약수로 나누기)
        int gcd = gcd(numerSum, denomSum);
        numerSum /= gcd;
        denomSum /= gcd;
        // 분자와 분모를 배열에 담아서 반환
        return new int[]{numerSum, denomSum};
    }

    // 최대 공약수
    public int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}