class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder str = new StringBuilder(my_string);
        StringBuilder word = new StringBuilder(my_string.substring(s, e+1));
        str.delete(s, e+1);
        str.insert(s, word.reverse());
        return str.toString();
    }
}