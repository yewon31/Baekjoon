import java.util.Arrays;

class Solution {
    // 지뢰가 매설된 n * n 배열이 주어질 때, 안전한 칸 수 반환
    public int solution(int[][] board) {
        // 지뢰 인접 지역 2로 변경
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    // 0인데 주위에 1이 있을 때 2로 변경
                    if (checkMine(board, i - 1, j - 1) || checkMine(board, i - 1, j)
                            || checkMine(board, i - 1, j + 1) || checkMine(board, i, j - 1)
                            || checkMine(board, i, j + 1) || checkMine(board, i + 1, j - 1)
                            || checkMine(board, i + 1, j) || checkMine(board, i + 1, j + 1)) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        // 이차원 배열 속 0 개수 반환
        return (int) Arrays.stream(board)
                .mapToInt(arr -> (int) Arrays.stream(arr).filter(i -> i == 0).count())
                .sum();
    }

    // 배열에서 특정 칸(i*j)의 값이 1인지 반환
    public boolean checkMine(int[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board.length) return false;
        if (board[i][j] == 1) return true;
        return false;
    }
}