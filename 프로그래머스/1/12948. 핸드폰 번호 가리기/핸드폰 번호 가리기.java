class Solution {
    // 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열 반환
    public String solution(String phone_number) {
        return phone_number.replaceAll("\\d(?=\\d{4})", "*");
    }
}