class Solution {
        public int solution(String number) {
            int answer = 0;
            int sum = 0;
            char[] cNum = number.toCharArray();
            for (int i = 0; i < cNum.length; i++) {
                sum += cNum[i] - '0';
            }
            answer = sum % 9;
            return answer;
        }
    }