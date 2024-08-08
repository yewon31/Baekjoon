import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    // 각 문자에 대해, 그보다 앞에 있는 가장 가까운 같은 문자와의 거리를 배열로 반환
    public int[] solution(String s) {
        String[] arr = s.split("");
        int[] distances = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String prevStr = s.substring(0, i);
            int lastMatch = -1;
            Matcher m = Pattern.compile(arr[i]).matcher(prevStr);
            while (m.find()) lastMatch = m.start();
            distances[i] = lastMatch == -1 ? -1 : i - lastMatch;
        }
        return distances;
    }
}