class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        for(String s : strArr) arr[s.length()]++;
        
        int answer = 0;
        for(int i : arr) if(i > answer) answer = i;
        return answer;
    }
}