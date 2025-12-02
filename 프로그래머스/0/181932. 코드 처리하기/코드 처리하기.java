class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        char[] codeArr = code.toCharArray();
        for (int i = 0; i < codeArr.length; i++) {
            if (mode == 0) {
                if (codeArr[i] == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        sb.append(codeArr[i]);
                    }
                }
            } else if (mode == 1) {
                if (codeArr[i] == '1') {
                    mode = 0;
                } else {
                    if (i % 2 != 0) {
                        sb.append(codeArr[i]);
                    }
                }
            }
        }
        String answer = sb.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}