class Solution {
        public int solution(String my_string, String is_prefix) {
            int answer = 0;
            String[] prefixes = new String[my_string.length()];
            for (int i = 0; i < my_string.length(); i++) {
                prefixes[i] = my_string.substring(0, i + 1);
            }
            for (int i = 0; i < prefixes.length; i++) {
                if (is_prefix.equals(prefixes[i])) {
                    answer = 1;
                }
            }
            return answer;
        }
    }