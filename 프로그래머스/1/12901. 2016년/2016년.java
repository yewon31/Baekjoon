class Solution {
    // 2016년 a월 b일이 무슨 요일인지 반환(SUN~SAT)
    public String solution(int a, int b) {
        /* [1] 배열 세팅 */
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; // 요일 배열 (SUN ~ SAT)
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 각 월의 일수 배열 (윤년)

        /* [2] 총 일수 계산 */
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i]; // a-1월 일수 합산
        }
        totalDays += b; // b일

        /* [3] 요일 인덱스 계산 */
        int idx = (totalDays + 4) % 7; // 1월 1일 금요일(5)에 대한 조정
        return daysOfWeek[idx]; // 해당 요일 반환
    }
}