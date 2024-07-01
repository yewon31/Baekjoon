import java.util.*;

class Solution {
    // 정수 배열 원소 중 최빈값 반환
    public int solution(int[] array) {
        // Map에 '값:개수'를 저장하면서, 최빈값의 개수 저장
        Map<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;
        for (int num : array) {
            int cnt = (map.get(num) == null) ? 1 : (map.get(num) + 1);
            maxCnt = Math.max(maxCnt, cnt); // 최빈값의 개수
            map.put(num, cnt);
        }
        // Map을 순회하면서 최빈값이 고유하다면 해당 값, 중복된다면 -1 반환
        int maxCntNum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCnt) {
                if (maxCntNum > 0) return -1;
                maxCntNum = entry.getKey();
            }
        }
        return maxCntNum;
    }
}