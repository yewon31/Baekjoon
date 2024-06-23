import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    // 그림 파일 배열을 가로 세로로 k배 늘린 배열 반환
    public String[] solution(String[] picture, int k) {
        // k배 늘린 배열 생성
        String[] lengthen = new String[picture.length * k];
        // 반복문
        for (int i = 0; i < picture.length; i++) {
            // 가로 k배 늘리기 (문자열 repeat)
            String widen = Arrays.stream(picture[i].split(""))
                    .map(str -> str.repeat(k))
                    .collect(Collectors.joining());
            // 세로 k배 늘리기 (배열 행 추가)
            for (int j = (i * k); j < (i * k + k); j++) {
                lengthen[j] = widen;
            }
        }
        // 반환
        return lengthen;
    }
}