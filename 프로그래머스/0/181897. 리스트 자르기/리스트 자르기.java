import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            case 4 : return IntStream.iterate(a, i -> i <= b, i -> i + c)
                            .map(i -> num_list[i])
                            .toArray();
        }
        return new int[0];
    }
}