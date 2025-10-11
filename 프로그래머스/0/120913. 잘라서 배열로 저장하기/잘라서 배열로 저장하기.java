import java.util.*;

class Solution {
        public String[] solution(String my_str, int n) {
            String[] answer = {};
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < my_str.length(); i += n) {
                list.add(my_str.substring(i, Math.min(i + n, my_str.length())));
            }
            answer = list.toArray(new String[0]);
            return answer;
        }
    }