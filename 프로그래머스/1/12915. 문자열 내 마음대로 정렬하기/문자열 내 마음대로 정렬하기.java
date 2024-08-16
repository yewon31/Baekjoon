import java.util.Arrays;

class Solution {
    // strings를 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            // n번째 글자에 따라 정렬
            int cmp = Character.compare(a.charAt(n), b.charAt(n));
            if (cmp != 0) return cmp;
            // n번째 글자가 같으면 전체 문자열에 대해 정렬
            return a.compareTo(b);
        });
        return strings;
    }
}