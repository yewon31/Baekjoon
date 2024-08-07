class Solution {
    // 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
    public String solution(String s) { // 한 개 이상의 단어로 구성(하나 이상의 공백문자로 구분)
        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String wordShift = "";
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                wordShift += (j % 2 == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            }
            arr[i] = wordShift;
        }
        return String.join(" ", arr);
    }
}