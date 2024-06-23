import java.util.Arrays;

class Solution {
    // spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재하는지 여부 반환
    public int solution(String[] spell, String[] dic) {
        // spell 배열 정렬 후 문자열로 변환
        Arrays.sort(spell);
        String spellAsc = String.join("", spell);
        // 반복문
        for (String word : dic) { //dzx  zdx
            // word도 정렬 후 문자열로 변환
            String[] wordArr = word.split("");
            Arrays.sort(wordArr);
            String wordAsc = String.join("", wordArr);
            // 동등 비교
            if (wordAsc.equals(spellAsc)) return 1; // 존재함
        }
        return 2; // 존재하지 않음
    }
}