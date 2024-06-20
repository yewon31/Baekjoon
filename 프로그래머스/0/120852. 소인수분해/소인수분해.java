import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 소인수 - 약수 중에서 소수만 구하기
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) { // 2 ~ n
            if (n % i == 0 && isPrime(i)) { // i는 약수이자 소수
                list.add(i);
            }
        }
        if (list.isEmpty()) list.add(n); // 약수가 없다면 n의 소인수는 n뿐
        return list.stream().mapToInt(Integer::intValue).toArray(); // 배열로 변환해서 반환
    }

    public boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) return false; // 약수가 있다면 소수x
        }
        return true;
    }
}