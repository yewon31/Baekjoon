import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 그리워하는 사람의 이름, 그리움 점수, 사진 속 이름이 주어질 때, 사진 추억 점수 반환
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] scoreArr = new int[photo.length];
        List<String> nameList = Arrays.asList(name); // indexof()를 사용하기 위해 이름 배열을 List로 변환
        for (int i = 0; i < photo.length; i++) { // 사진 개수만큼 반복
            int totalScore = 0;
            for (int j = 0; j < photo[i].length; j++) { // 해당 사진 속 사람 수만큼 반복
                int idx = nameList.indexOf(photo[i][j]); // 사진 속 인물의 이름을 주어진 이름 배열에서 찾기
                totalScore += idx > -1 ? yearning[idx] : 0; // 그리움 점수가 있는 인물이라면 해당 점수 누적
            }
            scoreArr[i] = totalScore; // 사진 추억 점수 저장
        }
        return scoreArr;
    }
}