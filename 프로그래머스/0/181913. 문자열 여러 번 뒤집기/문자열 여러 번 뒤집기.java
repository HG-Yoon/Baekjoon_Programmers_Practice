class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            String sub = sb.substring(s, e + 1);
            String reversed = new StringBuilder(sub).reverse().toString();
            sb.replace(s, e + 1, reversed);
        }
        answer = sb.toString();
        return answer;
    }
}