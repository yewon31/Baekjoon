import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(String[] strArr) {
        /****** 길이순 정렬 ******/
        String[] sortedArr = Arrays.stream(strArr)
                .sorted(Comparator.comparingInt(n -> n.length())) //사용자 정의 비교 기준 제공
                .toArray(String[]::new);
        /****** 개수 저장 배열 생성 ******/
        int maxLength = sortedArr[sortedArr.length - 1].length(); //정렬된 배열의 마지막 값의 길이
        int[] cntArr = new int[maxLength+1]; //1번 index에 길이 1 개수 저장
        /****** 개수 카운트 ******/
        for (String str : strArr) {
            cntArr[str.length()]++;
        }
        /****** 개수의 최댓값 출력 ******/
        return Arrays.stream(cntArr).max().getAsInt();
    }
}