class Solution {
    // n*n배열에 1부터 n^2까지 정수를 시계방향 나선형으로 배치하여 반환
    public int[][] solution(int n) {

        int[][] grid = new int[n][n]; // 값을 넣을 이차원 배열
        int num = 1; // 넣을 값 (1~n*n)

        // 한 줄 먼저 채우기
        for (int j = 0; j < n; j++) grid[0][j] = num++;

        // 반복문
        int i = 0, j = n - 1;
        int cnt = n;
        while (num <= n * n - 1) {
            for (int a = 1; a < cnt; a++) grid[++i][j] = num++; // 아래로
            for (int a = 1; a < cnt; a++) grid[i][--j] = num++; // 왼쪽으로
            cnt--;
            for (int a = 1; a < cnt; a++) grid[--i][j] = num++; // 위로
            for (int a = 1; a < cnt; a++) grid[i][++j] = num++; // 오른쪽으로
            cnt--;
        }

        return grid;
    }
}