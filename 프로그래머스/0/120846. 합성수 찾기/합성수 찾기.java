import java.util.stream.*;
class Solution {
    public int solution(int n) {
		return (int) IntStream
				.rangeClosed(4, n)
				.filter(i -> (int) IntStream.rangeClosed(2, i/2).filter(j -> i % j == 0).count() > 0)
				.count();
	}
}