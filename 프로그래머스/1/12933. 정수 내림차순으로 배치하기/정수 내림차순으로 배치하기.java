import java.util.Arrays;

class Solution {
    //  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수 반환
    public long solution(long n) {
        String sortedStr = Arrays.stream((n + "").split("")).sorted().reduce((a, b) -> b + a).orElse("");
        return Long.parseLong(sortedStr);
    }
}