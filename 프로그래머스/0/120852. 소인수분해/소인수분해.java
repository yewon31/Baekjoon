import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 2;
        while (n != 0 && i <= Math.sqrt(n)) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else i++;
        }
        if (n > 1) set.add(n);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}