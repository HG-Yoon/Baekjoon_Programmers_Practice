class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] my_chars = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            while (s < e) {
                char tmp = my_chars[s];
                my_chars[s] = my_chars[e];
                my_chars[e] = tmp;
                s++;
                e--;
            }
        }
        answer = String.valueOf(my_chars);
        return answer;
    }
}