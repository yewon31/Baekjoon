class Solution {
    // x가 '하샤드 수'라면 true 반환
    public boolean solution(int x) {
        int sum = 0; // 자릿수 합
        for (int i = x; i > 0; i /= 10) sum += i % 10;
        return x % sum == 0 ? true : false;
    }
}