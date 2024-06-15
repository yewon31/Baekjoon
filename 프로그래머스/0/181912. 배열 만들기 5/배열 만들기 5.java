import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(value -> Integer.parseInt(value.substring(s, s + l)))
                .filter(value -> value > k)
                .toArray();
    }
}