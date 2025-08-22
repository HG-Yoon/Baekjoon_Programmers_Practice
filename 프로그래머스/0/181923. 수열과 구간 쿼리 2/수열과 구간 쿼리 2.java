class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];
            int index = 0;
            for (int[] query : queries) {
                int min = Integer.MAX_VALUE;
                int s = query[0];
                int e = query[1];
                int k = query[2];
                for (int i = s; i <= e; i++) {
                    if (arr[i] > k) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                }
                if (min == Integer.MAX_VALUE) {
                    answer[index] = -1;
                } else {
                    answer[index] = min;
                }
                index++;
            }
            return answer;
        }
    }