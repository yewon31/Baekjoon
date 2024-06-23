class Solution {
    // my_string의 인덱스 s부터 인덱스 e까지를 뒤집는 명령을 순서대로 처리한 문자열 반환
    public String solution(String my_string, int[][] queries) {
        // StringBuilder로 변환
        StringBuilder sb = new StringBuilder(my_string);
        // 반복문
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            String reversed = new StringBuilder(sb.substring(s, e + 1)).reverse().toString();
            sb.replace(s, e + 1, reversed);
        }
        // 반환
        return sb.toString();
    }
}