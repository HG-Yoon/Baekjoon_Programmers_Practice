class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String prefix = my_string.substring(0, s);
        String part = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder(part);
        String reversedStr = sb.reverse().toString();
        String suffix = my_string.substring(e + 1, my_string.length());
        answer = prefix + reversedStr + suffix;
        return answer;
    }
}