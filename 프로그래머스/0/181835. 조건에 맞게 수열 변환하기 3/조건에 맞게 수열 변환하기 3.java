import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(answer).boxed().collect(Collectors.toList());
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                list.add(arr[i] * k);
            } else {
                list.add(arr[i] + k);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}