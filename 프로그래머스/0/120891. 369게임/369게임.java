class Solution {
    public int solution(int order) {
		int cnt = 0;
		for (int i = order; i > 0; i/=10) {
			int tmp = i%10;
			if(tmp==3 || tmp==6 || tmp==9) cnt++; 
		}
        return cnt;
    }
}