import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (n % 2 == 0) {
                list.add(n);
                n /= 2;
            } else {
                list.add(n);
                n = 3 * n + 1;
            }
            if (n == 1) {
                list.add(n);
                break;
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}