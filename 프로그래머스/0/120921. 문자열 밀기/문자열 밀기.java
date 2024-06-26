class Solution {
    // A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수 반환
    public int solution(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}