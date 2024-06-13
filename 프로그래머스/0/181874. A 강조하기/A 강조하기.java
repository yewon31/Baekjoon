import java.util.stream.*;
class Solution {
    public String solution(String myString) {
		return myString.toLowerCase().chars()
			.mapToObj(c -> String.valueOf((char) (c == 'a' ? Character.toUpperCase(c) : c)))
			.collect(Collectors.joining());
    }
}