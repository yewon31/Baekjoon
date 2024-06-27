import java.util.*;

class Solution {
    // numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열 반환
    public int[] solution(int[] numlist, int n) {
        // 삽입 정렬
        for (int i = 1; i < numlist.length; i++) {
            int key = numlist[i];
            int j = i - 1;
            while (j >= 0 && Math.abs(numlist[j] - n) >= Math.abs(key - n)) {
                if (Math.abs(numlist[j] - n) > Math.abs(key - n)) {
                    System.out.println(1);
                    numlist[j + 1] = numlist[j--];
                } else if (numlist[j] < key) {
                    System.out.println(2);
                    numlist[j + 1] = numlist[j--];
                } else {
                    break;
                }
            }
            numlist[j + 1] = key;
        }
        return numlist;
    }
}