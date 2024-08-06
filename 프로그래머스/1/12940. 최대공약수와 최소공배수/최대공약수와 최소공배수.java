class Solution {
    // 두 수의 최대공약수와 최소공배수를 반환하는 함수
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        return new int[]{gcd, n * m / gcd};
    }

    // 최대공약수
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}