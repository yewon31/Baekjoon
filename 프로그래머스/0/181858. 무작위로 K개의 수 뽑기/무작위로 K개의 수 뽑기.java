import java.util.*;

class Solution {
    // 랜덤으로 서로 다른 k개의 수를 저장한 배열
    public int[] solution(int[] arr, int k) {
        // 배열 값 중복 제거
        arr = Arrays.stream(arr).distinct().toArray();
        // 값을 저장할 list 생성
        List<Integer> list = new ArrayList<>();
        // 반복문
        int idx = 0;
        while (k-- > 0) {
            int num = (arr.length > idx) ? arr[idx++] : -1;
            list.add(num);
        }
        // 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}