import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    // 덧셈으로 이루어진 다항식이 주어질 때, 동류항끼리 더한 결괏값 반환
    public String solution(String polynomial) {
        // 계수 1 추가
        polynomial = polynomial.replaceAll("(?<!\\d)[x]", "1x");
        // 계수 덧셈
        Matcher match = Pattern.compile("\\d+(?=x)").matcher(polynomial); // x 앞 숫자
        int cntX = 0;
        while (match.find()) cntX += Integer.parseInt(match.group());
        String strX = "";
        if (cntX == 1) strX = "x";
        else if (cntX > 1) strX = cntX + "x";
        // 상수항 덧셈
        Matcher match2 = Pattern.compile("\\d+x?").matcher(polynomial); // 모든 숫자(계수 포함)
        int sum = 0;
        while (match2.find()) sum += match2.group().contains("x") ? 0 : Integer.parseInt(match2.group());
        String strN = cntX > 0 && sum > 0 ? " + " : "";
        if (sum > 0) strN += sum + "";

        return strX + strN;
    }
}