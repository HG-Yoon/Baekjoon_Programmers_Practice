import java.util.*;

class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            int[] answer = {};
            String[] ret = new String[intStrs.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < intStrs.length; i++) {
                ret[i] = intStrs[i].substring(s, s + l);
                if (Integer.parseInt(ret[i]) > k) {
                    stack.add(Integer.parseInt(ret[i]));
                }
            }
            answer = stack.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        }
    }