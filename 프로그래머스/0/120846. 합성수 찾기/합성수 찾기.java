class Solution {
    public int solution(int n) {
		int cnt = 0;
		for (int i = 4; i <= n; i++) {
			if(checkComposite(i)) cnt++;
		}
        return cnt;
    }
	
	public boolean checkComposite(int number) {
		for (int i = 2; i <= number/2; i++) {
			if(number%i==0) return true;
		}
		return false;
	}
}