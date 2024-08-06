class Solution {
    // n을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수 return
    public int solution(int n) { // 1 이상 100,000,000 이하
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(Integer.toString(n, 3)).reverse() + "";
        return Integer.parseInt(reversed, 3);
    }
}