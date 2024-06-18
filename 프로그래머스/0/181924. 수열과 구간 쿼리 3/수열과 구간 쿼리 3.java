import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        /****** List<Integer>로 변환 ******/
        List<Integer> list = Arrays.stream(arr) // IntStream
                                    .boxed() // Stream<Integer>
                                    .collect(Collectors.toList()); // List<Integer>
        /****** Collections.swap ******/
        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        /****** int[]로 되돌리기 ******/
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}