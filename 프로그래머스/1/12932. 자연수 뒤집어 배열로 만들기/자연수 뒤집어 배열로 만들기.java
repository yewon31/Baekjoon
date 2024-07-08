class Solution {
    public int[] solution(long n) {
        return new StringBuilder(n+"").reverse()
                                      .chars().map(Character::getNumericValue).toArray();
    }
}