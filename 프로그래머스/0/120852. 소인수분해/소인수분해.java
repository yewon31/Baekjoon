import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>(); //중복x 순서o
        
        int i = 2;
        while (n != 0 && i <= Math.sqrt(n)) {
            if (n % i == 0) { // i는 약수
                set.add(i);
                n /= i;
            } else i++;
        }
        if (n > 1) set.add(n);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}