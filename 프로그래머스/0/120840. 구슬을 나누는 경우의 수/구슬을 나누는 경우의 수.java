class Solution {
    // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수 반환
    public int solution(int balls, int share) {
        if (balls == share) return 1;
        long result = 1;
        for (int i = 1; i <= share; i++) {
            result *= balls--;
            result /= i;
        }
        return (int) result;
    }
}