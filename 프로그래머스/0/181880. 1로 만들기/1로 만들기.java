class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        for (int i = 0; i < num_list.length; i++) {
            while(num_list[i] != 1){
                num_list[i] /= 2;
                cnt++;
            }
        }
        return cnt;
    }
}