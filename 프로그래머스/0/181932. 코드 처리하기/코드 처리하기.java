class Solution {
    // 문자열 code를 통해 만들어진 문자열 ret 반환
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        char[] chArr = code.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            if (ch == '1') mode += 1 + mode * -2; // 0은 1로, 1은 0으로
            else if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) ret += ch;
        }
        return !ret.isEmpty() ? ret : "EMPTY";
    }
}