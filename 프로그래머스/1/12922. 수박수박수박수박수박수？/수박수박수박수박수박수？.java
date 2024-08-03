class Solution {
    // 길이가 n이고, "수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
    public String solution(int n) {
        String str = "수박".repeat((n - 1) / 2);
        return n % 2 == 0 ? str + "수박" : str + "수";
    }
}