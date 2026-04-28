class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                c = 'A';
            }
            if (Character.isUpperCase(c) && c != 'A') {
                c += 32;
            }
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}