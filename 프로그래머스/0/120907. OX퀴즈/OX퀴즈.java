import java.util.Arrays;

class Solution {
    // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열 반환
    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++) {
            String[] text = quiz[i].split(" "); // a + b = c
            int result = Integer.parseInt(text[0]) + (Integer.parseInt(text[2]) * (text[1].equals("+") ? 1 : -1));
            quiz[i] = ((result + "").equals(text[4])) ? "O" : "X";
        }
        return quiz;
    }
}