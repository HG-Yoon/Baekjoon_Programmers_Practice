import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int idx = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") && idx == -1) {
                idx = i;
                answer = Arrays.copyOfRange(str_list, 0, idx);
            } else if (str_list[i].equals("r") && idx == -1) {
                idx = i;
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }
}