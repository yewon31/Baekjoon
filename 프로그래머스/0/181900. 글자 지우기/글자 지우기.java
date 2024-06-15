class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            strArr[indices[i]] = "";
        }
        return String.join("", strArr);
    }
}