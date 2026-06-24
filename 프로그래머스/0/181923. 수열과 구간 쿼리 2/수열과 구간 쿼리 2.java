import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        int input = 0;
        for (int i = 0; i < queries.length; i++) {
            tmpList.clear();
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    tmpList.add(arr[j]);
                }
            }
            if (tmpList.isEmpty()) {
                answerList.add(-1);
            } else {
                answerList.add(Collections.min(tmpList));
            }
        }
        answer = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}