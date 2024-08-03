class Solution {
    // 단어 s의 가운데 글자를 반환하는 함수
    public String solution(String s) {
        String[] arr = s.split("");
        int len = arr.length;
        return len % 2 == 1 ? arr[len / 2] : arr[len / 2 - 1] + arr[len / 2];
    }
}