import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            if (k == 0) continue; //0의 배수
            if (s % k != 0) { //s가 k의 배수가 아닐 경우
                s = (s + k) - (s % k); //s보다 큰 k의 배수
                System.out.println(s);
            }
            for (int i = s; i <= e; i += k) { //k의 배수 인덱스
                arr[i]++;
            }
        }
        return arr;
    }
}