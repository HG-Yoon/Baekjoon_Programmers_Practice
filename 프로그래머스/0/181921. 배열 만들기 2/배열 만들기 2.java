import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean valid = true;
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        } else {
            list.sort((a, b) -> a - b);
        }
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}