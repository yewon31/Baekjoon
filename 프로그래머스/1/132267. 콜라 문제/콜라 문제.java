class Solution {
    // '빈 병 a개 -> 콜라 b개'일 때, 빈 병 n개로 받을 수 있는 콜라의 총 개수 반환
    public int solution(int a, int b, int n) {

        int totalGet = 0; // 받은 콜라 총 개수
        int have = n; // 가지고 있는 빈 병 개수

        while (have >= a) {
            int get = have / a * b; // 받은 콜라 개수
            have = have % a + get; // 남은 콜라 + 새로 받은 콜라
            totalGet += get; // 받은 콜라 총 개수 누적
        }
        return totalGet;
    }
}