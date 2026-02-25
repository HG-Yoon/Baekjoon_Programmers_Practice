class Solution {
    public int solution(int a, int b) {
        int concatAb = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int doubleProduct = 2 * a * b;

        return Math.max(concatAb, doubleProduct);
    }
}