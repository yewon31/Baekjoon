import java.util.*;

public class Solution {
    public int solution(int n) {
        return Arrays.stream((n + "").split("")).mapToInt(Integer::valueOf).sum();
    }
}