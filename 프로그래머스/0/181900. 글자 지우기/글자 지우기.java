import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Set<Integer> set = Arrays.stream(indices)
                .boxed()
                .collect(Collectors.toSet());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!set.contains(i)) {
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}