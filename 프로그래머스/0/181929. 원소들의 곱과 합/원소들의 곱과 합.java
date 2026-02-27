class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1, sumPow = 0;
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sumPow += num_list[i];
        }
        sumPow *= sumPow;
        if (mul < sumPow) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}