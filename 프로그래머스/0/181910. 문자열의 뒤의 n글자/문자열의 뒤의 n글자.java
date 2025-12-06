class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        String reversedStr = sb.reverse().toString();
        String subStr = reversedStr.substring(0, n);
        sb = new StringBuilder(subStr);
        answer = sb.reverse().toString();
        return answer;
    }
}