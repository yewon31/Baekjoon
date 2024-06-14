import java.util.Arrays;
class Solution {
    public int solution(int[] date1, int[] date2) {
        String dateA = String.format("%04d%02d%02d", date1[0], date1[1], date1[2]);
        String dateB = String.format("%04d%02d%02d", date2[0], date2[1], date2[2]);
        return dateA.compareTo(dateB) < 0 ? 1 : 0;
    }
}