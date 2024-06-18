import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.toList());
        int i = list.indexOf(2);
        int j = list.lastIndexOf(2);
        return (i < 0) ? new int[]{-1} : Arrays.copyOfRange(arr, i, j + 1);
    }
}