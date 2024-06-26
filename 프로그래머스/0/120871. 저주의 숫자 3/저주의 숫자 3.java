import java.util.stream.IntStream;

class Solution {
    // 정수 n을 3x 마을에서 사용하는 숫자로 바꿔서 반환(3과 3의 배수는 사용x)
public int solution(int n) {
    int num = 1;
    int cnt = 1;
    while (cnt < n) {
        cnt++;
        num++;
        while (num % 3 == 0 || (num + "").indexOf("3") > -1) { // 3의 배수이거나 3이 들어감
            num++;
        }
    }
    return num;
}
}