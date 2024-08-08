class Solution {
    // 일부 자릿수를 영단어로 바꾼 s가 주어질 때, 의미하는 원래 숫자를 return
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], i + "");
        }
        return Integer.parseInt(s);
    }
}