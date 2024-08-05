class Solution {
    // 놀이기구를 count번 타게 되면 얼마가 모자라는지 return하는 함수
    // 원래 이용료는 price원, N 번 째 이용한다면 원래 이용료의 N배
    public long solution(int price, int money, int count) {
        long total = price * (count * (count + 1) / (long) 2);
        return Math.max(total - money, 0); // 금액이 부족하지 않으면 0
    }
}