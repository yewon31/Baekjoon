class Solution {
    // 작업을 몇 번이나 반복해야 1이 되는지 횟수 반환
    public int solution(int num) {
        int cnt = 0;
        long longNum = num;
        while (longNum > 1) {
            longNum = longNum % 2 == 0 ? longNum / 2 : longNum * 3 + 1;
            if (++cnt == 500) return -1;
        }
        return cnt;
    }
}