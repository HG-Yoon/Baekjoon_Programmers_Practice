import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> prefixList = new ArrayList<>();
        for (int i = 1; i < my_string.length() + 1; i++) {
            prefixList.add(my_string.substring(0, i));
        }
        String[] prefixArr = prefixList.toArray(new String[0]);
        for (int i = 0; i < prefixArr.length; i++) {
            if (prefixArr[i].equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}