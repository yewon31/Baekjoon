import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }
        return list.isEmpty() ? new int[]{-1} : list.stream().sorted().mapToInt(i -> i).toArray();
    }
}