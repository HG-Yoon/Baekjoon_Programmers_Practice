import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int lIdx = -1;
        int rIdx = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                lIdx = i;
                break;
            }
            if (str_list[i].equals("r")) {
                rIdx = i;
                break;
            }
        }
        // lIdx만 찾은 경우 (rIdx == -1)
        if (lIdx != -1 && rIdx == -1) {
            answer = Arrays.copyOfRange(str_list, 0, lIdx);
        } else if (rIdx != -1 && lIdx == -1) {
            // rIdx만 찾은 경우 (lIdx == -1)
            answer = Arrays.copyOfRange(str_list, rIdx + 1, str_list.length);
        } else if (lIdx == -1 && rIdx == -1) {
            answer = new String[]{};
        }
        return answer;
    }
}