import java.util.Locale;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String LowerCaseMyString = myString.toLowerCase();
        String LowerCasePat = pat.toLowerCase();
        if (LowerCaseMyString.contains(LowerCasePat)) {
            answer = 1;
        }
        return answer;
    }
}