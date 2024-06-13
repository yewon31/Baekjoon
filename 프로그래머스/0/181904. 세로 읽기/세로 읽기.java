import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public String solution(String my_string, int m, int c) {
        return IntStream.range(0, my_string.length())
                .filter(i -> i % m == c - 1)
                .mapToObj(i -> my_string.charAt(i)+"")
                .collect(Collectors.joining());
    }
}