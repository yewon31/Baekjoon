import java.util.HashMap;
import java.util.Map;

class Solution {
    // 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1
    public int solution(int[][] dots) {
        // 이차원 배열을 map에 저장 -> {0, {x:0, {y:0}} ...
        Map<Integer, Map<String, Integer>> map = new HashMap<>();
        for (int i = 0; i < dots.length; i++) {
            map.put(i, Map.of("x", dots[i][0], "y", dots[i][1]));
        }
        // 두 직선이 평행이 되는지 체크(비율 확인)
        if ((getRatio(map.get(0), map.get(1)) == getRatio(map.get(2), map.get(3)))
                || (getRatio(map.get(0), map.get(2)) == getRatio(map.get(1), map.get(3)))
                || (getRatio(map.get(0), map.get(3)) == getRatio(map.get(1), map.get(2)))) {
            return 1;
        }
        return 0;
    }

    // 점(좌표) 두개를 이었을 때의 비율(세로/가로)
    public double getRatio(Map<String, Integer> mapA, Map<String, Integer> mapB) {
        int width = Math.abs(mapA.get("x") - mapB.get("x"));
        int height = Math.abs(mapA.get("y") - mapB.get("y"));
        return (double) height / width;
    }
}