class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if(!sb.toString().contains(ch+"")) sb.append(ch);
        }
        return sb.toString();
    }
}   