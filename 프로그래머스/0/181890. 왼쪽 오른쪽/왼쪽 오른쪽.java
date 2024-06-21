import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String str = String.join("", str_list);
        int idxL = str.indexOf('l') > -1 ? str.indexOf('l') : str_list.length; // 해당 인덱스가 없다면 최댓값으로 설정
        int idxR = str.indexOf('r') > -1 ? str.indexOf('r') : str_list.length;
        if (idxL < idxR) return Arrays.copyOf(str_list, idxL);
        else if (idxL > idxR) return Arrays.copyOfRange(str_list, idxR + 1, str_list.length);
        return new String[0];
    }
}