class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean a = checkTorF(x1, x2);
        boolean b = checkTorF(x3, x4);
        return checkTandF(a, b); //(x1 ∨ x2) ∧ (x3 ∨ x4)
    }
    public boolean checkTorF(boolean x, boolean y) {
        return x || y; // 논리합
    }
    public static boolean checkTandF(boolean x, boolean y) {
        return x && y; // 논리곱
    }
}