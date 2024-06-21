class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int idxA = a.length() - 1;
        int idxB = b.length() - 1;
        int carry = 0;
        while (idxA > -1 || idxB > -1) {
            int numA = idxA < 0 ? 0 : a.charAt(idxA--) - '0';
            int numB = idxB < 0 ? 0 : b.charAt(idxB--) - '0';
            int sum = numA + numB + carry;
            sb.append(sum % 10);
            carry = sum / 10; // 자리 올림수
        }
        if (carry > 0) sb.append(1);
        return sb.reverse().toString();
    }
}