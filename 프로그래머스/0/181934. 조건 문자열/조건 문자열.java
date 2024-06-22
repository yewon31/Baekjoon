class Solution {
    // 문자열에 따라 두 수의 크기 비교
    public int solution(String ineq, String eq, int n, int m) {
        boolean B1 = ">".equals(ineq) ? n > m : n < m; // 대소 비교
        boolean B2 = "=".equals(eq) ? n == m : false; // 동등 비교
        return B1 || B2 ? 1 : 0;
    }
}