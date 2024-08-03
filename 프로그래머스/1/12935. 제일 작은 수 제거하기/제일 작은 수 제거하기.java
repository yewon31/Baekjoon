import java.util.Arrays;

class Solution {
    // arr 에서 가장 작은 수를 제거한 배열 반환
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        return arr.length == 1 ? new int[]{-1} : Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}