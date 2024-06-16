class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        while (i <= j) {
            cnt += (i++ + "").replaceAll("[^" + k + "]", "").length();
        }
        return cnt;
    }
}