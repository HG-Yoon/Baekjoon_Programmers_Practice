class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] my_string_arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            while (s < e) {
                char tmp = my_string_arr[s];
                my_string_arr[s] = my_string_arr[e];
                my_string_arr[e] = tmp;
                s++;
                e--;
            }
        }
        answer = String.valueOf(my_string_arr);
        return answer;
    }
}