import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("\\D", " "); //자연수 제외 문자 제거
        StringTokenizer st = new StringTokenizer(my_string);
        int sum = 0;
        while(st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
        return sum;
    }
}