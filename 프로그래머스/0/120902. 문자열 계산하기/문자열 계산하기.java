import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int result = Integer.parseInt(st.nextToken()); // 초기값
        while (st.hasMoreTokens()) {
            result += (st.nextToken().equals("+") ? 1 : -1) * Integer.parseInt(st.nextToken());
        }
        return result;
    }
}