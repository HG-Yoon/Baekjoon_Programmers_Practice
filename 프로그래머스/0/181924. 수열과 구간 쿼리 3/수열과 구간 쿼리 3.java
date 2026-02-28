class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int a = 0; a < queries.length; a++) {
            int i = queries[a][0];
            int j = queries[a][1];
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        answer = arr;
        return answer;
    }
}