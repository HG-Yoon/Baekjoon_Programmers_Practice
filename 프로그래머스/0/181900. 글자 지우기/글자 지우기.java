import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string, int[] indices) {
        // 제거할 인덱스를 Set에 저장
        Set<Integer> removeSet = new HashSet<>();
        for (int idx : indices) {
            removeSet.add(idx);
        }
        // StringBuilder로 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            // 제거 대상이 아니면 추가
            if (!removeSet.contains(i)) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}