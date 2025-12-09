import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    // 아직 start가 설정되지 않았다면
                    start = i;
                }
                end = i;
            }
        }
        if (start != -1 && end != -1) {
            for (int i = start; i <= end; i++) {
                temp.add(arr[i]);
            }
        } else if (start != -1 && end == -1) {
            temp.add(2);
        } else if (start == -1 && end == -1) {
            temp.add(-1);
        }
        answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}