class Solution {
    // s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수
    public String solution(String s) { // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else break;
            }
        }
        return new String(arr);
    }
}