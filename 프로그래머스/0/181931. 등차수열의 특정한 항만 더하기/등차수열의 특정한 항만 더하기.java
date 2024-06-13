class Solution {
    public int solution(int a, int d, boolean[] included) {
        int cnt = 0;
        for (int i = 0; i < included.length; i++) {
            if(included[i]) cnt += a + d*i;
        }
        return cnt;
    }
}