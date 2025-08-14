class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
            int twoAb = 2 * a * b;
            if (ab > twoAb || ab == twoAb) {
                answer = ab;
            } else {
                answer = twoAb;
            }
            return answer;
        }
    }