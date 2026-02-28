import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> resultList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            resultList.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            resultList.add(num_list[num_list.length - 1] * 2);
        }
        answer = resultList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}