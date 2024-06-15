class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder word = new StringBuilder(my_string.substring(s, e+1));
        word.reverse();
        return my_string.substring(0, s) + word + my_string.substring(e + 1);
    }
}