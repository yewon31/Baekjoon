import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed() // Comparator 인터페이스를 사용하기 위해 IntStream을 Stream<Integer>로 변환
                .sorted(Comparator.reverseOrder())                      // 역순 정렬
                .sorted(Comparator.comparing(num -> Math.abs(num - n))) // n과의 차이를 기준으로 정렬
                .mapToInt(i -> i)   // int[]로 변환하기 위해 IntStream으로 우선 변환
                .toArray();         // int[]로 변환
    }
}