class Solution {
    // 절댓값, 부호 -> 실제 정수들의 합을 구하여 return
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return sum;
    }
}