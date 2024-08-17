import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 명예의 전당 점수 개수 k와 점수배열 score이 주어질 때, 명예의 전당의 최하위 점수 배열 반환
    public int[] solution(int k, int[] score) {

        List<Integer> topList = new ArrayList<>(); // 명예의 전당 목록(상위 k개까지 저장)
        int days = score.length;
        int[] minScores = new int[days]; // 명예의 전당의 최하위 점수 배열

        for (int i = 0; i < days; i++) {
            int min;
            if (topList.size() < k) {
                topList.add(score[i]); // 명예의 전당 채우기
                min = topList.stream().min(Integer::compare).get(); // 최하위 점수 구하기
            } else {
                min = topList.stream().min(Integer::compare).get(); // 최하위 점수 구하기
                if (topList.size() == k && score[i] > min) { // 명예의 전당이 가득 찼을 때 오늘의 점수가 최하위 점수보다 높다면
                    topList.remove(new Integer(min)); // 최하위 점수 제거
                    topList.add(score[i]); // 오늘 점수 추가
                    min = topList.stream().min(Integer::compare).get(); // 최하위 점수 다시 구하기
                }
            }
            minScores[i] = min; // 오늘의 최종 최하위 점수 저장
        }
        return minScores;
    }
}