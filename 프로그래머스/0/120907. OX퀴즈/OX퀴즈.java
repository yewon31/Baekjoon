import java.util.Arrays;

class Solution {
    // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열 반환
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] verifyArr = new String[len];
        for (int i = 0; i < len; i++) {
            String[] arr = quiz[i].split(" = ");
            verifyArr[i] = verify(arr[0], arr[1]);
        }
        return verifyArr;
    }

    public String verify(String exp, String resultStr) { // "3 - 4 = -3"
        String[] arr = exp.split(" [+-] ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int result = 0;
        if (exp.indexOf("+") > 0) result = a + b;
        else result = a - b;
        return (result + "").equals(resultStr) ? "O" : "X";
    }
}