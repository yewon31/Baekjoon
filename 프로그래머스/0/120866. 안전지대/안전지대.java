import java.util.Arrays;

class Solution {
    // 지뢰가 매설된 n * n 배열이 주어질 때, 안전한 칸 수 반환
    public int solution(int[][] board) {
        // 지뢰 인접 지역 2로 변경
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    // 0인데 주위에 1이 있을 때 2로 변경
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k < 0 || k >= board.length || l < 0 || l >= board.length) continue;
                            if (board[k][l] == 1) board[i][j] = 2;
                        }
                    }
                }
            }
        }
        // 이차원 배열 속 0 개수 반환
        return (int) Arrays.stream(board)
                .mapToInt(arr -> (int) Arrays.stream(arr).filter(i -> i == 0).count())
                .sum();
    }
}