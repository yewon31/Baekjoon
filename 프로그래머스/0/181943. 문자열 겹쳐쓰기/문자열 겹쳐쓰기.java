class Solution {
    // str1의 인덱스 s부터 str2 길이만큼을 str2로 바꾼 문자열 반환
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}