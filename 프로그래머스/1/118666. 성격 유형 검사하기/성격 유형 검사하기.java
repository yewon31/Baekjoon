import java.util.Map;
import java.util.TreeMap;

class Solution {
    // 지표(비동의/동의)와 선택한 번호(1:매우 비동의~7)가 주어질 때, 결과를 지표 번호 순서대로 반환
    public String solution(String[] survey, int[] choices) {
        //1번 지표	라이언형(R), 튜브형(T)
        //2번 지표	콘형(C), 프로도형(F)
        //3번 지표	제이지형(J), 무지형(M)
        //4번 지표	어피치형(A), 네오형(N)

        //1	매우 비동의(3)
        //2	비동의(2)
        //3	약간 비동의(1)
        //4	모르겠음(0)
        //5	약간 동의(1)
        //6	동의(2)
        //7	매우 동의(3)

        /* [1] */
        char[][] chars = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        /* [2] */
        Map<Character, Integer> map = new TreeMap<>();
        for (char[] c : chars) {
            map.put(c[0], 0);
            map.put(c[1], 0);
        }

        /* [3] */
        for (int i = 0; i < survey.length; i++) { // AN

            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            int score = Math.abs(4 - choices[i]); // 1 또는 7은 3, 2 또는 6은 2, 3 또는 5는 1
            switch (choices[i]) {
                case 1: case 2: case 3: map.put(c1, map.get(c1) + score); break;
                case 5: case 6: case 7: map.put(c2, map.get(c2) + score); break;
            }
        }

        /* [4] */
        StringBuilder sb = new StringBuilder();
        sb.append(map.get('T') > map.get('R') ? "T" : "R");
        sb.append(map.get('F') > map.get('C') ? "F" : "C");
        sb.append(map.get('M') > map.get('J') ? "M" : "J");
        sb.append(map.get('N') > map.get('A') ? "N" : "A");

        /* [5] */
        return sb.toString();
    }

}