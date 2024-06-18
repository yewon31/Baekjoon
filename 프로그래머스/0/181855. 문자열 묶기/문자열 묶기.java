import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        /****** 개수 저장 배열 생성 ******/
        int maxLength = 30; //strArr의 원소의 길이 최댓값
        int[] cntArr = new int[maxLength + 1]; //1번 index에 길이 1 개수 저장
        /****** 개수 카운트 ******/
        for (String str : strArr) {
            cntArr[str.length()]++;
        }
        /****** 개수의 최댓값 출력 ******/
        return Arrays.stream(cntArr).max().getAsInt();
    }
}