import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.replaceAll("[abc]", " ").replaceAll("[ ]+", " ").trim().split(" ");
        String[] emptyArr = {"EMPTY"};
        return arr[0].equals("") ? emptyArr : arr;
    }
}