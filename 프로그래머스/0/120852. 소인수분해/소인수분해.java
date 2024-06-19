import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 소인수 - 약수 중에서 소수만 구하기
        Set<Integer> set = new TreeSet<>(); //중복x
        for (int i = 2; i <= Math.sqrt(n); i++) { // 2 ~ n의 제곱근(그 외 값은 어차피 소수 x)
            while (n % i == 0) { // i는 약수
                set.add(i);
                n /= i; // 나누어 떨어지지 않을 때까지 i로 나누어주기
            }
        }
        if (n > 1) set.add(n);
        // 배열로 변환해서 반환
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}