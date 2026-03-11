import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}