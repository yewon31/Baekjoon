class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] arr = new int[num_list.length/n][n];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num_list[idx++];
            }
        }
        return arr;
    }
}