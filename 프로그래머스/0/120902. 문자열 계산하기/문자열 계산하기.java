import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int result = Integer.parseInt(st.nextToken()); // 초기값
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals("+")) result += Integer.parseInt(st.nextToken());
            else if (s.equals("-")) result -= Integer.parseInt(st.nextToken());
        }
        return result;
    }
}