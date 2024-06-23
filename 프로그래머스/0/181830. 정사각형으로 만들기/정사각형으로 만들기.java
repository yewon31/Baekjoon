import java.util.Arrays;

class Solution {
    // 직사각형 배열 arr을 가장 큰 정사각형 배열로 만들어 반환
    public int[][] solution(int[][] arr) {
        // 정사각형 배열 생성(값은 0으로 자동 초기화)
        int row = arr.length;
        int column = arr[0].length;
        int max = Math.max(row, column);
        int[][] arrCopy = new int[max][max];
        // 배열 값 복사
        for (int i = 0; i < row; i++) {
            System.arraycopy(arr[i], 0, arrCopy[i], 0, arr[i].length);
            // System.arraycopy(원본 배열, 복사 시작 인덱스, new 배열, new 배열 시작 인덱스, 복사 길이);
        }
        // 반환
        return arrCopy;
    }
}