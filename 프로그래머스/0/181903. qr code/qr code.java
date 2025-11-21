class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] codeArr = code.toCharArray();
        for (int i = 0; i < codeArr.length; i++) {
            if (i % q == r) {
                answer += codeArr[i];
            }
        }
        return answer;
    }
}