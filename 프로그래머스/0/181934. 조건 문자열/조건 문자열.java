class Solution {
    // 문자열에 따라 두 수의 크기 비교
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) return n >= m ? 1 : 0;
            else return n > m ? 1 : 0;
        } else { // <
            if (eq.equals("=")) return n <= m ? 1 : 0;
            else return n < m ? 1 : 0;
        }
    }
}