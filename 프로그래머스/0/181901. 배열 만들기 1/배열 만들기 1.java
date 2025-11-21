import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(answer).boxed().collect(Collectors.toList());
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}