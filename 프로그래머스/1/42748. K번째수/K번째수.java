import java.util.Arrays;

class Solution {
    // array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수 반환
    public int[] solution(int[] array, int[][] commands) {
        int cnt = commands.length;
        int[] answer = new int[cnt];
        for (int x = 0; x < cnt; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            int[] newArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(newArray);
            answer[x] = newArray[k - 1];
        }
        return answer;
    }
}