class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddNum = 0;
        int evenNum = 0;
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                oddSb.append(String.valueOf(num_list[i]));
            } else if (num_list[i] % 2 == 0) {
                evenSb.append(String.valueOf(num_list[i]));
            }
        }
        oddNum = Integer.parseInt(oddSb.toString());
        evenNum = Integer.parseInt(evenSb.toString());
        answer = oddNum + evenNum;
        return answer;
    }
}