import java.util.*;

class Solution {
    // N마리 종류 배열이 주어질 때, N/2마리를 선택할 경우 가질 수 있는 최대 종류 개수 반환
    public int solution(int[] nums) {

        int cnt = nums.length / 2; // 고를 마리 수

        // HashSet<Integer>로 변환
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        return Math.min(set.size(), cnt);
    }
}