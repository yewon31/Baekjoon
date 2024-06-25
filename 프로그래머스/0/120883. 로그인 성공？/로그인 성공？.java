import java.util.Arrays;

class Solution {
    // 입력한 아이디와 패스워드가 담긴 배열 id_pw
    // 회원들의 정보가 담긴 2차원 배열 db
    // 로그인 성공, 실패에 따른 메시지 반환
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] account : db) {
            if (id.equals(account[0])) {
                if (pw.equals(account[1])) return "login";
                return "wrong pw";
            }
        }
        return "fail";
    }
}