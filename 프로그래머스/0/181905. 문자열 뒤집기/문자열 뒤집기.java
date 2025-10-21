class Solution {
        public String solution(String my_string, int s, int e) {
            String answer = "";
            String prefix = my_string.substring(0, s);
            String to_reverse = my_string.substring(s, e + 1);
            String suffix = my_string.substring(e + 1);
            StringBuilder sb = new StringBuilder(to_reverse);
            String reversed_part = sb.reverse().toString();
            answer = prefix + reversed_part + suffix;
            return answer;
        }
    }