import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> suffixList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            suffixList.add(my_string.substring(i));
        }
        if (suffixList.contains(is_suffix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}