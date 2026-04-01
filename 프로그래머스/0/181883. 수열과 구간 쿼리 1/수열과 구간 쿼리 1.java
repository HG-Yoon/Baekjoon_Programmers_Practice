class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr, 0, answer, 0, answer.length);
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for (int j = s; j <= e; j++) {
                answer[j] += 1;
            }
        }
        return answer;
    }
}