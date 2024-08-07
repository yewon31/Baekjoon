class Solution {
    // 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수
    // 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식 -> 시저 암호
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                char ch = (char) (arr[i] + n);
                if (Character.isUpperCase(arr[i]) && !Character.isUpperCase(ch)
                        || Character.isLowerCase(arr[i]) && !Character.isLowerCase(ch)) {
                    ch = (char) (ch - 26);
                }
                arr[i] = ch;
            }
        }
        return new String(arr);
    }
}