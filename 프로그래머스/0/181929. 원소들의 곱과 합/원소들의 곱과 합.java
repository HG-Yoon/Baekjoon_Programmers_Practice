class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int sum = 0;
            int mul = 1;
            for (int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
                mul *= num_list[i];
            }
            int powOfSum = sum * sum;
            answer = mul < powOfSum ? 1 : 0;
            return answer;
        }
    }