class Solution {
    // 부호와 숫자로 이루어진 문자열을 숫자로 변환하여 반환
    public int solution(String s) {
        if (s.indexOf("+") > 0) return Integer.parseInt(s.substring(1));
        if (s.indexOf("-") > 0) return Integer.parseInt(s.substring(1)) * -1;
        return Integer.parseInt(s);
    }
}