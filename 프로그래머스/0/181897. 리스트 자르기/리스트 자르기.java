import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        /****** 변수 설정 ******/
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        /****** 조건문 ******/
        switch (n) {
            case 1 : return Arrays.copyOf(num_list, b+1);
            case 2 : return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3 : return Arrays.copyOfRange(num_list, a, b+1);
            case 4 :
                List<Integer> list = new ArrayList<>();
                for (int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }
                int[] result = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    result[i] = list.get(i);
                }
                return result;
        }
        return new int[0];
    }
}