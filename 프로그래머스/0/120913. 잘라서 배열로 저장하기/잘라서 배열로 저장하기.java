import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        int len = my_str.length();
        for (int i = 0; i < my_str.length(); i += n) {
            list.add(my_str.substring(i, Math.min(i + n, len)));
        }
        return list.stream().toArray(String[]::new);
    }
}