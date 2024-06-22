class Solution {
    public int solution(int balls, int share) {
        int[][] DP = new int[balls + 1][share + 1];
        for (int i = 0; i <= balls; i++) {
            for (int j = 0; j <= Math.min(i, share); j++) {
                if (j == 0 || j == i) DP[i][j] = 1;
                else DP[i][j] = DP[i - 1][j] + DP[i - 1][j - 1];
            }
        }
        return DP[balls][share];
    }
}