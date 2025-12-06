import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> suffix = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            suffix.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(suffix);
        return suffix.toArray(new String[0]);
    }
}