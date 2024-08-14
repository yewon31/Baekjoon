import java.util.*;

class Solution {
    // numbers 원소 중 두 개를 더해서 만들 수 있는 수를 모두 구하여 오름차순으로 반환 
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
}