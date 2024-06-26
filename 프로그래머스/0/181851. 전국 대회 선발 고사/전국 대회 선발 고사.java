import java.util.*;
import java.util.stream.IntStream;

class Solution {
    // 참여가 가능한 학생 중 등수가 높은 3명 선발
    // 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c 반환
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)          // 정수 범위 IntStream 생성(학생 번호)
                        .filter(i -> attendance[i])     // 참여 가능 학생의 번호만 남기기
                        .boxed()                        // Stream<Integer>로 변환
                        .sorted(Comparator.comparing(i -> rank[i]))      // 등수순 정렬
                        .limit(3)                                        // 3명만 가져오기
                        .reduce((a, b) -> a * 100 + b)                   // (10000 × a) + (100 × b) + c
                        .get();                                          // 최종 값 반환
    }
}