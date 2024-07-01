import java.util.*;
import java.util.stream.Collectors;

class Solution {
    // 네 주사위를 굴렸을 때 나온 숫자가 주어질 때 얻는 점수 반환
    public int solution(int a, int b, int c, int d) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(a, b, c, d));
        numList = numList.stream().sorted().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numList);
        if (set.size() == 1) { // 4 전부 동일
            return numList.get(0) * 1111;
        }
        if (set.size() == 2) { // 3:1 or 2:2
            if (numList.get(1) == numList.get(2)) { // 3:1(p:q) => (10*p+q)^2
                int p = numList.get(1);
                for (int i = 0; i < 3; i++) numList.remove(Integer.valueOf(p)); // Integer 객체로 변환 -> remove(Object o) 호출
                int q = numList.get(0);
                return (10 * p + q) * (10 * p + q);
            }
            // 2:2
            int p = numList.get(0);
            int q = numList.get(2);
            return (p + q) * (q - p);
        }
        if (set.size() == 3) { // 2:1:1(p:q:r) -> q*r
            List<Integer> duplRemoveList = new ArrayList<>();
            for (Integer num : numList) {
                if (duplRemoveList.contains(num)) {
                    duplRemoveList.remove(num);
                } else duplRemoveList.add(num);
            }
            return duplRemoveList.get(0) * duplRemoveList.get(1);
        }
        // 1:1:1:1
        return numList.get(0);
    }
}