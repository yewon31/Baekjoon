class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        for (int num : num_list) {
            cnt += getCalculationCnt(num);
        }
        return cnt;
    }

    /* num을 1로 만들기 위해 필요한 나누기 연산 횟수 반환 */
    public int getCalculationCnt(int num) {
        int cnt = 0;
        while (num != 1) {
            cnt++;
            if (num % 2 == 0) num /= 2;
            else num = (num - 1) / 2;
        }
        return cnt;
    }
}