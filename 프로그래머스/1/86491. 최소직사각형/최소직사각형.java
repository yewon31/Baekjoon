class Solution {
    // 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return
    public int solution(int[][] sizes) { // 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열
        int maxW = 0, maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            int w = Math.max(size[0], size[1]); // 긴 사이즈롤 가로 길이로
            int h = Math.min(size[0], size[1]);
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        return maxW * maxH;
    }
}