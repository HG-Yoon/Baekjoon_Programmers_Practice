import java.util.ArrayList;
import java.util.List;

class Solution {
    static boolean check(int x) {
        while (x > 0) {
            int digit = x % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (check(i)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}