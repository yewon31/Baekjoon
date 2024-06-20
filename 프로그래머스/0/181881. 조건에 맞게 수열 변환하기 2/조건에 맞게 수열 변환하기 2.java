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
                    num /= 2;
                }
                if ((num < 50) && (num % 2 == 1)) {
                    flag = true;
                    num = num * 2 + 1;
                }
                arr[i] = num;
            }
            /****** 연산을 안했다면 탈출 ******/
            if (!flag) break;
            cnt++;
        }
        return cnt;
    }
}