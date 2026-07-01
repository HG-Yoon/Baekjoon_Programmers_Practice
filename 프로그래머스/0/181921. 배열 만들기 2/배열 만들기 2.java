import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String iStr = String.valueOf(i);
            boolean found = true;
            for (int j = 0; j < iStr.length(); j++) {
                if (iStr.charAt(j) != '0' && iStr.charAt(j) != '5') {
                    found = false;
                }
            }
            if (found) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}