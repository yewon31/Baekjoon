
class Solution {
    // 음식의 양이 칼로리가 적은 순서대로 주어졌을 때, 음식의 배치를 나타내는 문자열 반환
    public String solution(int[] food) {
        String str = "0"; // 물 배치
        for (int i = food.length - 1; i > 0; i--) { // 칼로리가 많은 음식부터 안쪽에 배치
            int amount = food[i];
            for (int j = 0; j < amount / 2; j++) {
                str = i + str + i; // 왼쪽/오른쪽 끝에 배치
            }
        }
        return str;
    }
}