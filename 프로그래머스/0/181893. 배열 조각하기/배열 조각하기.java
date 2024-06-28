import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int idxS = 0;
        int idxE = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            if (i % 2 == 0) idxE = Math.min(idxS + idx, idxE);
            else idxS = Math.max(idxS + idx, idxS);
        }
        return Arrays.copyOfRange(arr, idxS, idxE + 1);
    }
}