import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 저장한 배열 반환
    public int[] solution(int[] arr, int[][] queries) {
        // ArrayList 선언
        List<Integer> list = new ArrayList<>();
        // 반복문
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            // s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]
            int num = Arrays.stream(Arrays.copyOfRange(arr, s, e + 1))
                    .sorted()
                    .filter(i -> i > k)
                    .findFirst().orElse(-1);
            list.add(num);
        }
        // 반환
        return list.stream().mapToInt(i -> i).toArray();
    }
}