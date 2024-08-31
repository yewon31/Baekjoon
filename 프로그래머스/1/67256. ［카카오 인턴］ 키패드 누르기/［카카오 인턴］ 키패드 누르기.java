class Solution {
    // 순서대로 번호를 누른 엄지손가락이 어느손인지 문자열로 반환
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftCurNum = 10;
        int rightCurNum = 12;
        for (int num : numbers) {
            num = (num == 0) ? 11 : num;
            char ch = 0;
            switch (num) {
                case 1: case 4: case 7:
                    ch = 'L'; break;
                case 3: case 6: case 9:
                    ch = 'R'; break;
                default:
                    int a = Math.abs(leftCurNum - num);
                    a = a / 3 + a % 3;
                    int b = Math.abs(rightCurNum - num);
                    b = b / 3 + b % 3;
                    if(a == b) ch = hand.equals("right") ? 'R' : 'L';
                    else if(a > b) ch = 'R'; else ch = 'L';
            }
            if (ch=='L') leftCurNum = num;
            else if (ch=='R') rightCurNum = num;
            sb.append(ch);
        }
        return sb.toString();
    }
}