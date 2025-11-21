class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] my_string_arr = my_string.toCharArray();
        for (int i = 0; i < my_string_arr.length; i++) {
            char ch = my_string_arr[i];
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}