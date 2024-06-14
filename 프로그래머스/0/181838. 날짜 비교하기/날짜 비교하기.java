class Solution {
    public int solution(int[] date1, int[] date2) {
        int a = Integer.parseInt(""+date1[0]+date1[1]+date1[2]);
        int b = Integer.parseInt(""+date2[0]+date2[1]+date2[2]);
        return (a < b) ? 1 : 0;
    }
}