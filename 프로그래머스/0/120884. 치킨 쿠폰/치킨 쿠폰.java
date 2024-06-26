class Solution {
    // chicken - 시켜먹은 치킨의 수
    // 받을 수 있는 최대 서비스 치킨의 수 반환
    public int solution(int chicken) {
        int serviceCnt = chicken / 9;
        if (chicken > 1 && chicken % 9 == 0) serviceCnt--;
        return serviceCnt;
    }
}