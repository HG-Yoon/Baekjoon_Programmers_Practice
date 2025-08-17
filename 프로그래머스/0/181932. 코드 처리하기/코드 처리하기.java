class Solution {
        public String solution(String code) {
            String ret = "";
            String[] code_idx = code.split("");
            for (int idx = 0, mode = 0; idx < code_idx.length; idx++) {
                boolean code_eq_1 = code_idx[idx].equals("1");

                if (mode == 0) {
                    if (!code_eq_1 && idx % 2 == 0) {
                        ret += code_idx[idx];
                    }
                    if (code_eq_1) {
                        mode = 1;
                    }
                } else {
                    if (!code_eq_1 && idx % 2 != 0) {
                        ret += code_idx[idx];
                    }
                    if (code_eq_1) {
                        mode = 0;
                    }
                }
            }
            return ret == "" ? "EMPTY" : ret;
        }
    }