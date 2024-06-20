class Solution {
    public int solution(String[] order) {
        int price = 0;
        for (String menu : order) {
            price += menu.contains("latte") ? 5000 : 4500;
        }
        return price;
    }
}