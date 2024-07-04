class Solution {

    // 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1
    int[][] dots;

    public int solution(int[][] dots) {
        this.dots = dots;
        if (checkParallel(0, 1, 2, 3)) return 1;
        if (checkParallel(0, 2, 1, 3)) return 1;
        if (checkParallel(0, 3, 1, 2)) return 1;
        return 0;
    }

    boolean checkParallel(int a, int b, int c, int d) {
        double ratioAB = (double) (dots[a][1] - dots[b][1]) / (dots[a][0] - dots[b][0]); // a와 b를 이은 직선의 기울기(y/x)
        double ratioCD = (double) (dots[c][1] - dots[d][1]) / (dots[c][0] - dots[d][0]);
        return ratioAB == ratioCD || ratioAB == -ratioCD;
    }
}