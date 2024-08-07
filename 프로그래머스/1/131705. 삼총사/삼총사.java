class Solution {
    // 학생들 중 삼총사를 만들 수 있는 방법의 수를 return
    // 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사
    public int solution(int[] number) { // 한국중학교 학생들의 번호를 나타내는 정수 배열
        int len = number.length;
        int cnt = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i+1; j < len - 1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (number[i] + number[j] + number[k] == 0) cnt++;
                }
            }
        }
        return cnt;
    }
}