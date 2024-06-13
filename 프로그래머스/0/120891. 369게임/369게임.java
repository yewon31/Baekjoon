class Solution {
    public int solution(int order) {
        return (order+"").replaceAll("[^3^6^9]", "").length();
    }
}