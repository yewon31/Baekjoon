class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        while (myString.length() > 1) {
            int idx = myString.indexOf(pat);
            if (idx > -1) cnt++;
            myString = myString.substring(idx > -1 ? idx + 1 : 1);
        }
        return myString.equals(pat) ? cnt + 1 : cnt;
    }
}