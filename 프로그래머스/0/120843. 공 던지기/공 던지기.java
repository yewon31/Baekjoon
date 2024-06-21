class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int idx = 0;
        while (k-- > 1) {
            idx = (idx + 2) % len;
        }
        return idx + 1;
    }
}