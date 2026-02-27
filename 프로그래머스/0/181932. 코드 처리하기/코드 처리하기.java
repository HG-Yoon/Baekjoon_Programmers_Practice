class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (!(code.charAt(i) == '1')) {
                    if (i % 2 == 0) {
                        sb.append(code.charAt(i));
                    }
                } else {
                    if (code.charAt(i) == '1') {
                        mode = 1;
                    }
                }
            } else if (mode == 1) {
                if (!(code.charAt(i) == '1')) {
                    if (i % 2 != 0) {
                        sb.append(code.charAt(i));
                    }
                } else {
                    mode = 0;
                }
            }
        }
        ret = sb.toString();
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}