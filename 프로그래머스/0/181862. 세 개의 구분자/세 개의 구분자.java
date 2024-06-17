import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.replaceAll("[abc]+", " ").trim().split(" ");
        return arr[0].equals("") ? new String[]{"EMPTY"} : arr;
    }
}