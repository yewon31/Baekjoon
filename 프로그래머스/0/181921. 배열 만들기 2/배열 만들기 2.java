import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int start = (l % 5 == 0) ? l : (l / 5) * 5 + 5;
        for (int i = start; i <= r; i += 5) {
            if ((i + "").replaceAll("[05]", "").length() == 0) list.add(i);
        }
        return !list.isEmpty() ? list.stream().mapToInt(i -> i).toArray() : new int[]{-1};
    }
}