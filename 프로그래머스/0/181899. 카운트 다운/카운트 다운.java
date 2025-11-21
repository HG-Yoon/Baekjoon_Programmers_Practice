import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(answer).boxed().collect(Collectors.toList());
        for (int i = start_num; i >= end_num; i--) {
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}