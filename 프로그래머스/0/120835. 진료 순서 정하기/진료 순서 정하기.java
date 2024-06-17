import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedArr);
        for (int i = 0; i < emergency.length; i++) {
            int order = 0;
            for (int j = 0; j < sortedArr.length; j++) {
                if (emergency[i] == sortedArr[j]) {
                    order = emergency.length - j;
                    break;
                }
            }
            emergency[i] = order;
        }
        return emergency;
    }
}