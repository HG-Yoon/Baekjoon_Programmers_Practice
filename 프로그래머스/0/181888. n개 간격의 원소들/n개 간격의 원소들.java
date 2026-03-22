class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int length = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}