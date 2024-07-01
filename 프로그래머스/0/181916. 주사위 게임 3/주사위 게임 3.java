import java.util.Arrays;

class Solution {
    // 네 주사위를 굴렸을 때 나온 숫자가 주어질 때 얻는 점수 반환
    public int solution(int a, int b, int c, int d) {
        // 값 정렬 후 재할당
        int[] dice = {a, b, c, d}; Arrays.sort(dice);
        a = dice[0]; b = dice[1]; c = dice[2]; d = dice[3];
        // [1] 4:0
        if (a == d) return a * 1111;
        // [2] 3:1(p:q) => (10*p+q)^2
        if (a == c || b == d) return (b * 10 + (a + d - b)) * (b * 10 + (a + d - b));
        // [3] 2:2
        if (a == b && c == d) return (a + c) * (c - a);
        // [4] 2:1:1(p:q:r) -> q*r
        if (a == b) return c * d;
        if (b == c) return a * d;
        if (c == d) return a * b;
        // [5] 1:1:1:1
        return a;
    }
}