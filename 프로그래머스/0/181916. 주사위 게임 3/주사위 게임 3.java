import java.util.*;

class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] dice = {a, b, c, d};
            Map<Integer, Integer> countMap = new HashMap<>();

            // 각 숫자의 빈도 계산
            for (int num : dice) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // 빈도에 따라 점수 계산
            if (countMap.size() == 1) {
                // 네 개 모두 같은 경우
                return 1111 * a;
            } else if (countMap.size() == 2) {
                // 세 개가 같은 숫자이고, 나머지 하나는 다른 숫자
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 3) {
                        int p = key;
                        int q = 0;
                        for (int k : countMap.keySet()) {
                            if (k != p) q = k;
                        }
                        return (int) Math.pow(10 * p + q, 2);
                    }
                }
                // 두 개는 같은 숫자, 그리고 나머지 두 개도 서로 같은 숫자인데
                // 이 두 숫자가 서로 다른 값일 때
                List<Integer> keys = new ArrayList<>(countMap.keySet());
                int p = keys.get(0);
                int q = keys.get(1);
                return (p + q) * Math.abs(p - q);
            } else if (countMap.size() == 3) {
                // 네 개 중 두 개는 같은 숫자
                // 나머지 두 개는 서로 다른 숫자
                int pair = 0;
                List<Integer> singles = new ArrayList<>();
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 2) {
                        pair = key;
                    } else {
                        singles.add(key);
                    }
                }
                return singles.get(0) * singles.get(1);
            } else {
                // 모두 다른 경우
                return Arrays.stream(dice).min().getAsInt();
            }
        }
    }