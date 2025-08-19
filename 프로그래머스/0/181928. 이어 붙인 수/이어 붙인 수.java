class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            String oddStr = "", evenStr = "";
            int oddNum, evenNum;
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 != 0) {
                    oddStr += String.valueOf(num_list[i]);
                } else if (num_list[i] % 2 == 0) {
                    evenStr += String.valueOf(num_list[i]);
                }
            }
            oddNum = Integer.parseInt(oddStr);
            evenNum = Integer.parseInt(evenStr);
            answer = oddNum + evenNum;
            return answer;
        }
    }