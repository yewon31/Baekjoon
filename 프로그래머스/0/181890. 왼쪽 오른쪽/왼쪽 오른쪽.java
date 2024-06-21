import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int idxL = String.join("", str_list).indexOf('l');
        int idxR = String.join("", str_list).indexOf('r');
        /******  ******/
        if (idxL == -1) idxL = str_list.length;
        if (idxR == -1) idxR = str_list.length;
        /******  ******/
        if (idxL < idxR) return Arrays.copyOf(str_list, idxL);
        else if (idxL > idxR) return Arrays.copyOfRange(str_list, idxR + 1, str_list.length);
        return new String[0];
    }
}