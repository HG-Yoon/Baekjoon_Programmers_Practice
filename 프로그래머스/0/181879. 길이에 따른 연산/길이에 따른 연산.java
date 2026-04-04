class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        if (num_list.length >= 11) {
            for (int n : num_list) {
                sum += n;
            }
            answer = sum;
        } else if (num_list.length <= 10) {
            for (int n : num_list) {
                mul *= n;
            }
            answer = mul;
        }
        return answer;
    }
}