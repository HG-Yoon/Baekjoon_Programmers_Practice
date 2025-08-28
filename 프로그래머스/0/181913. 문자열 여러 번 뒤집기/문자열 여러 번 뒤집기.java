class Solution {
        public String solution(String my_string, int[][] queries) {
            String[] str = my_string.split("");
            for (int[] query : queries) {
                for (int i = query[0]; i <= (query[1] + query[0]) / 2; i++) {
                    String temp = str[i];
                    str[i] = str[query[1] + query[0] - i];
                    str[query[1] + query[0] - i] = temp;
                }
            }
            return String.join("", str);
        }
    }