import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // if (str_list[0].equals("l")) break;
                if (i == 0) break; // 첫 등장하는 l의 인덱스가 첫번째 인덱스라면
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                // if (str_list[str_list.length - 1].equals("r")) break;
                if (i == str_list.length - 1) break; // 첫 등장하는 r의 인덱스가 마지막 인덱스라면
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
        }
        return list.stream().toArray(String[]::new);
    }
}