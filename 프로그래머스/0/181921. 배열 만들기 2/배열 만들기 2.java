import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // l~r 정수 중에서 "0"과 "5"로만 이루어진 정수를 오름차순으로 저장한 배열 반환
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (++i > 0) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5; // 1, 10, 11, 100 ...
            if (l <= num && num <= r) list.add(num);
            else if (num > r) break;
        }
        return !list.isEmpty() ? list.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }
}