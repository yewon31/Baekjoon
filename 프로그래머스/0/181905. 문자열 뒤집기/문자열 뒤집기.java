class Solution {
    public String solution(String my_string, int s, int e) {
        String[] strArr = my_string.split("");
        int cnt = (e-s+1)/2;
        String tmp = "";
        while(cnt-- > 0) {
            tmp = strArr[s];
            strArr[s++] = strArr[e];
            strArr[e--] = tmp;
        }
        return String.join("", strArr);
    }
}