import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for (int a = 0; a < queries.length; a++) {
            int s = queries[a][0];
            int e = queries[a][1];
            int k = queries[a][2];
            int minValue = Integer.MAX_VALUE;
            for (int b = s; b <= e; b++) {
                if (arr[b] > k) {
                    minValue = Math.min(minValue, arr[b]);
                }
            }
            if (minValue == Integer.MAX_VALUE) {
                list.add(-1);
            } else {
                list.add(minValue);
            }

        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}