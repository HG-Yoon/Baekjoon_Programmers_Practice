class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sumSquare = 0;
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sumSquare += num_list[i];
        }
        sumSquare *= sumSquare;
        return mul < sumSquare ? 1 : 0;
    }
}