class Solution {
    // t에서 p와 길이가 같은 부분문자열 중에서,
    // 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return
    public int solution(String t, String p) { // 숫자로 이루어진 문자열
        int len = p.length(); // 1 ≤ p의 길이 ≤ 18
        long longP = Long.parseLong(p);
        int i = -1;
        int cnt = 0;
        while (t.length() > i + len) { // p의 길이 ≤ t의 길이 ≤ 10,000
            if (Long.parseLong(t.substring(++i, i + len)) <= longP) cnt++;
        }
        return cnt;
    }
}