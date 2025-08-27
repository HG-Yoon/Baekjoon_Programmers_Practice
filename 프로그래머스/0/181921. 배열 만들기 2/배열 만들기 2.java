import java.util.*;

class Solution {
        List<Integer> result = new ArrayList<>();

        void generate(long current, int l, int r) {
            if (current > r) {
                return;
            }
            if (current >= l) {
                result.add((int) current);
            }

            generate(current * 10 + 0, l, r);
            generate(current * 10 + 5, l, r);
        }

        public int[] solution(int l, int r) {
            generate(5, l, r);

            if (result.isEmpty()) {
                return new int[]{-1};
            }

            Collections.sort(result);

            return result.stream().mapToInt(i -> i).toArray();
        }
    }