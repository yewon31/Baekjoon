import java.util.*;

class Solution {
    // 네 가지를 최대 한 번씩 조합한 발음만 가능할 때, 가능한 단어 개수 반환
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        for (String word : babbling) { // 단어
            for (String s : arr) word = word.replace(s, " ");
            if (word.trim().isEmpty()) cnt++;
        }
        return cnt;
    }
}