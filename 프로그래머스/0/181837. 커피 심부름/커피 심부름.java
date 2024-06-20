class Solution {
    public int solution(String[] order) {
        int price = 0;
        for (String menu : order) {
            if (menu.contains("cafelatte")) price += 5000; //카페라떼
            else price += 4500; //아메리카노 or 아무거나
        }
        return price;
    }
}