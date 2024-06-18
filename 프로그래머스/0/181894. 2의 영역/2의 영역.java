import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        /****** int[] → List<Integer> ******/
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        /****** index 추출 ******/
        int i = list.indexOf(2);
        int j = list.lastIndexOf(2);
        /****** 부분 배열 반환 ******/
        return (i < 0) ? new int[]{-1} : Arrays.copyOfRange(arr, i, j + 1);
    }
}