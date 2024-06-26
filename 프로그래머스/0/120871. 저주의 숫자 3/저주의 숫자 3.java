import java.util.Arrays;

class Solution {
    // 정수 n을 3x 마을에서 사용하는 숫자로 바꿔서 반환(3과 3의 배수는 사용x)
    public int solution(int n) {
        int num = 1;
        for (int i = 1; i < n; i++) {
            num++;
            while (num % 3 == 0 || (num + "").indexOf("3") > -1) num++;
        }
        return num;
    }
}