import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    // score - 학생 별 점수 2개
    // 점수 평균 기준으로 매긴 등수를 담은 배열 반환
    public int[] solution(int[][] score) {
        // 평균만 담은 list 생성
        List<Double> list = Arrays.stream(score).map(student -> (double)(student[0] + student[1]) / 2).collect(Collectors.toList());
        // 정렬한 list 생성
        List<Double> listSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // 등수 배열 반환
        return list.stream().mapToInt(i -> listSorted.indexOf(i) + 1).toArray();
    }
}