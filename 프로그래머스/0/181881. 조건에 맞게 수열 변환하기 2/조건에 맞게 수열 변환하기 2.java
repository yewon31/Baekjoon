class Solution {
public int solution(int[] arr) {
    int cnt = 0; // 연산 횟수
    while (true) {
        boolean flag = false; // 연산 여부
        /****** 배열 순회하면서 연산 ******/
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if ((num >= 50) && (num % 2 == 0)) {
                flag = true;
                arr[i] = num / 2;
            } else if ((num < 50) && (num % 2 == 1)) {
                flag = true;
                arr[i] = num * 2 + 1;
            }
        }
        /****** 연산을 안했다면 탈출 ******/
        if (!flag) break;
        cnt++;
    }
    return cnt; //최종 연산 횟수 반환
}
}