import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        for (int i = a1; i <= b1; i++) {
            temp.add(arr[i]);
        }
        for (int i = a2; i <= b2; i++) {
            temp.add(arr[i]);
        }
        answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}