import java.util.Arrays;

class Solution {
    // numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열 반환
    public int[] solution(int[] numlist, int n) {
        int[] arr = new int[numlist.length];
        for (int i : numlist) {
            int rank = 0;
            int ii = Math.abs(n - i);
            for (int j : numlist) {
                int jj = Math.abs(n - j);
                if (ii > jj) rank++;
                else if (ii == jj && j > i) rank++;
            }
            arr[rank] = i;
        }
        return arr;
    }
}