class Solution {
    //  s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True 반환
    boolean solution(String s) {
        int cntP = s.replaceAll("[^Pp]", "").length();
        int cntY = s.replaceAll("[^Yy]", "").length();
        return cntP == cntY;
    }
}