class Solution {
    
    // 삼각형의 두 변의 길이가 주어질 때, 나머지 한 변이 될 수 있는 정수의 개수
    public int solution(int[] sides) { // 1 ≤ sides의 원소 ≤ 1,000

        // 변수 세팅
        int x = Math.max(sides[0], sides[1]); // 두 변의 길이 중 큰 값
        int y = Math.min(sides[0], sides[1]); // 두 변의 길이 중 작은 값
        int z; // 나머지 한 변의 길이
        int cnt = 0;

        // x가 가장 길 경우
        z = x;
        while (z <= x && x < y + z--) cnt++;

        // 나머지 한 변(z)이 가장 긴 변인 경우
        z = x + 1;
        while (z > x && z++ < x + y) cnt++;

        // 반환
        return cnt;
    }
}