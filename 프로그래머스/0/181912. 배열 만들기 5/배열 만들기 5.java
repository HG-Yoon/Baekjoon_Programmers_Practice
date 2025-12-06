import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String subStr = intStrs[i].substring(s, s + l);
            int intSubStr = Integer.parseInt(subStr);
            if (intSubStr > k) {
                list.add(intSubStr);
            }
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}