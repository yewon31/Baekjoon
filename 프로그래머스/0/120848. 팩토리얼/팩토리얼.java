class Solution {
    public int solution(int n) {
        int num = 1;
        int cnt = 1;
        while(cnt++ > 0) {
            num *= cnt;
            if(num>n) return cnt-1;
        }
        return 1;
    }
}