import java.util.Arrays;

class Solution {
    // 세 선분의 시작/끝 좌표가 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이 반환
    public int solution(int[][] lines) {
        // 각각의 선분 길이만큼 배열 값 증가(칸 채우기)
        int[] rangeArr = new int[200];     // 선분 범위 (-100 ≤ a < b ≤ 100)
        for (int[] line : lines) {
            int s = line[0] + 100;         // 0번 인덱스부터 저장하기 위해 +100
            int e = line[1] + 100;
            for (int i = s; i < e; i++) {
                rangeArr[i]++;
            }
        }
        // 값이 2 이상인 개수 반환
        return (int) Arrays.stream(rangeArr).filter(i -> i > 1).count();
    }
}