class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddSum = 0, evenSum = 0;
        for (int i = 1; i <= num_list.length; i++) {
            if (i % 2 != 0) {
                oddSum += num_list[i - 1];
            } else if (i % 2 == 0) {
                evenSum += num_list[i - 1];
            }
        }
        if (oddSum > evenSum) {
            answer = oddSum;
        } else if (oddSum < evenSum) {
            answer = evenSum;
        } else {
            answer = oddSum;
        }
        return answer;
    }
}