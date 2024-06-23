class Solution {

    // 삼각형의 두 변의 길이가 주어질 때, 나머지 한 변이 될 수 있는 정수의 개수
    public int solution(int[] sides) {

        /****** 변수 세팅 ******/
        int x = Math.max(sides[0], sides[1]); // 두 변의 길이 중 큰 값
        int y = Math.min(sides[0], sides[1]); // 두 변의 길이 중 작은 값

        /****** 나머지 한 변 길이의 최솟값과 최댓값 ******/
        int min = x - y + 1;
        int max = x + y - 1;

        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작다.
        // (x가 가장 크다면) x < y + z // z > x - y // z의 최솟값 x - y + 1
        // (z가 가장 크다면) z < x + y // z < x + y // z의 최댓값은 x + y - 1

        /****** 개수 반환 ******/
        return max - min + 1;
    }
}