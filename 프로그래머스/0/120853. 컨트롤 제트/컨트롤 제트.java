import java.util.Arrays;
class Solution {
    public int solution(String s) {
        int sum = Arrays.stream(s.split("[Z ]+")).mapToInt(Integer::parseInt).sum(); //모든 숫자 합계
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i].equals("Z")) sum -= Integer.parseInt(arr[--i]);
        }
        return sum;
    }
}