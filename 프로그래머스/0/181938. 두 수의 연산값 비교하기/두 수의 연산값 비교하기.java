class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int doubleAb = 2 * a * b;
        answer = ab == doubleAb ? ab : Math.max(ab, doubleAb);
        return answer;
    }
}