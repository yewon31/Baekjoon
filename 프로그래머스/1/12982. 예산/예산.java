import java.util.Arrays;

class Solution {
    // 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
    // 최대 몇 개의 부서에 물품을 지원할 수 있는지 return
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int cnt = -1;
        while (budget >= sum && ++cnt < d.length) {
            sum += d[cnt];
        }
        return cnt;
    }
}