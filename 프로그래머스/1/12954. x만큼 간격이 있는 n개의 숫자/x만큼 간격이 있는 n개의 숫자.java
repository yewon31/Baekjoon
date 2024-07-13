import java.util.stream.Stream;

class Solution {
    // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트 반환
    public long[] solution(int x, int n) {
        return Stream.iterate((long)x, i -> i + x).limit(n).mapToLong(i -> i).toArray();
    }
}