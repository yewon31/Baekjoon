class Solution {
    // 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}