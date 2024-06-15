import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String solution(String myString, String pat) {
        Matcher match = Pattern.compile("[\\w]*"+pat).matcher(myString);
        match.find();
        return match.group();
    }
}