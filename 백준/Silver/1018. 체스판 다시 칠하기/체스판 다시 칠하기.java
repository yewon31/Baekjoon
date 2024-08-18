import java.io.*;
import java.util.*;

public class Main {
    // M×N 크기의 보드를 잘라서 8x8 크기의 체스판으로 만들 때, 다시 칠해야 하는 정사각형의 최소 개수 출력
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행의 수
        int M = Integer.parseInt(st.nextToken()); // 열의 수

        char[][] board = new char[N][M]; // 보드 배열 생성
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray(); // 입력된 문자열을 문자 배열로 변환⭐
        }

        /* [2] 최솟값 찾기 */
        int minCount = Integer.MAX_VALUE; // 최솟값 초기화
        for (int row = 0; row <= N - 8; row++) {
            for (int col = 0; col <= M - 8; col++) {
                minCount = Math.min(minCount, getMinChanges(board, row, col)); // 함수 호출⭐
            }
        }
        System.out.println(minCount); // 결과 출력
    }

    // 8x8 영역에서 다시 칠해야 하는 최소 정사각형 개수 반환
    public static int getMinChanges(char[][] board, int startRow, int startCol) {

        int cntW = 0; // 다시 칠해야 하는 개수('W'로 시작하는 경우)
        int cntB = 0; // 다시 칠해야 하는 개수('B'로 시작하는 경우)

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startRow + i][startCol + j];
                /* [1] 체스판의 올바른 색상 이진수와 비교('W'로 시작하는 경우) */
                char chessColor = ((i + j) % 2 == 0) ? 'W' : 'B'; // 올바른 색상⭐
                if (current != chessColor) cntW++;
                /* [2] 체스판의 올바른 색상 이진수와 비교('B'로 시작하는 경우) */
                chessColor = chessColor == 'W' ? 'B' : 'W'; // 반대
                if (current != chessColor) cntB++;
            }
        }

        return Math.min(cntW, cntB); // 두 경우 중 더 적은 변경 횟수 반환⭐
    }
}