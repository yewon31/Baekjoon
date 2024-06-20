class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("Z")) i--; //건너뛰기
            else sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}