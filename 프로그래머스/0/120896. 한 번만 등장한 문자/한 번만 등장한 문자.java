import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) list.add(ch + "");
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        return String.join("", arr);
    }
}