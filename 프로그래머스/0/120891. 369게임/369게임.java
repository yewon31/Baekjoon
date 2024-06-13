import java.util.Arrays;
class Solution {
    public int solution(int order) {
        return (int) Arrays.stream((order+"").split(""))
                .filter(i -> i.equals("3") || i.equals("6") || i.equals("9"))
                .count();
    }
}