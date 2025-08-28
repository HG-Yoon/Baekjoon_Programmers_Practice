class Solution {
        public String solution(String my_string, int[] index_list) {
            String answer = "";
            String[] str = my_string.split("");
            for (int index : index_list) {
                answer += str[index];
            }
            return answer;
        }
    }