import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> tmp_list = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            tmp_list.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            tmp_list.add(num_list[num_list.length - 1] * 2);
        }
        answer = tmp_list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}