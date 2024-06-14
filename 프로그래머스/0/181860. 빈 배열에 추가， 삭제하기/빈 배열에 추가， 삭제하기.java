import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flag.length; i++) {
            int num = arr[i];
            int len = sb.length();
            if(flag[i]) sb.append((num+"").repeat(num*2));
            else sb.delete(len-num, len);
        }
        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray(); //StringBuilder -> int[]
    }
}