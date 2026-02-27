class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr = "";
        String evenStr = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                oddStr += String.valueOf(num_list[i]);
            } else {
                evenStr += String.valueOf(num_list[i]);
            }
        }
        int oddNum = Integer.parseInt(oddStr);
        int evenNum = Integer.parseInt(evenStr);
        answer = oddNum + evenNum;
        return answer;
    }
}