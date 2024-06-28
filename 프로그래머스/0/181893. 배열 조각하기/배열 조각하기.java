import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int idxS = 0;
        int idxE = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            int idx = idxS + query[i];
            if (i % 2 == 0) idxE = idx;
            else idxS = idx;
        }
        return Arrays.copyOfRange(arr, idxS, idxE + 1);
    }
}