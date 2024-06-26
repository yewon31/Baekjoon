class Solution {
    // chicken - 시켜먹은 치킨의 수
    // 받을 수 있는 최대 서비스 치킨의 수 반환
    public int solution(int chicken) {
        int serviceCnt = 0;
        if(chicken > 9) serviceCnt += 1 + (chicken - 10) / 9;
        return serviceCnt;
    }
}