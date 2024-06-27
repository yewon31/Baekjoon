import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < numlist.length; j++) {
                int absJ = Math.abs(numlist[j] - n);
                int absMin = Math.abs(numlist[minIdx] - n);
                if ((absJ < absMin) || (absJ == absMin && numlist[j] > numlist[minIdx])) minIdx = j;
            }
            swap(numlist, i, minIdx);
        }
        return numlist;
    }
    public int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }
}