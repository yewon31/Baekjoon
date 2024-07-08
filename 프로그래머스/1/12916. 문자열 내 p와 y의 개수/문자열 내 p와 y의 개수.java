class Solution {
    //  s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True 반환
    boolean solution(String s) {
        s = s.toUpperCase();
        long cntP = s.chars().filter(e -> e == 'P').count();
        long cntY = s.chars().filter(e -> e == 'Y').count();
        return cntP == cntY;
    }
}