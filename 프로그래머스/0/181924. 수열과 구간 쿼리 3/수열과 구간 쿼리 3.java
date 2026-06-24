class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int idx = 0; idx < queries.length; idx++) {
            int i = queries[idx][0];
            int j = queries[idx][1];
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        answer = arr;
        return answer;
    }
}