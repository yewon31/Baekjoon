class Solution {
    // a/b가 유한소수라면 1, 무한소수라면 2 반환
    public int solution(int a, int b) {
        /****** a/b 를 기약분수로 나타내기 위해 최대공약수로 나눠주기 ******/
        b /= gcd(a, b);
        /****** 분모를 2와 5로 나누어주기 ******/
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        /****** 분모의 소인수가 2와 5만 존재한다면 유한소수 ******/
        return b == 1 ? 1 : 2;
    }
    public int gcd(int a, int b) {
        int c = a % b; // 나머지
        return (c == 0) ? b : gcd(b, c); // 나눈 수를 나머지로 나누기
    }
}