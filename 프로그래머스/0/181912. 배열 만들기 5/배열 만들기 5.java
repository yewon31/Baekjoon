import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s+l));
            if(num > k) list.add(num);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}