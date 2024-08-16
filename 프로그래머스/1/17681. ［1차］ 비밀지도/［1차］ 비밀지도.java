import java.util.Arrays;

class Solution {
    // 지도의 한 변 크기 n 과 지도 1 배열, 지도 2 배열이 주어질 때, 전체지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) { // n행
            long x1 = arr1[i]; // ex.9
            String formattedStr1 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(x1))); // ex. 01001
            long x2 = arr2[i];
            String formattedStr2 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(x2)));

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) { // n열
                int num = (formattedStr1.charAt(j) - '0') + (formattedStr2.charAt(j) - '0');
                sb.append(num > 0 ? "#" : " "); // 어느 하나라도 벽 -> 전체 지도에서 벽
            }

            answer[i] = sb.toString();
        }
        return answer;
    }
}