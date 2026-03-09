class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] myStringArr = my_string.toCharArray();
        while (s < e) {
            char tmp = myStringArr[s];
            myStringArr[s] = myStringArr[e];
            myStringArr[e] = tmp;
            s++;
            e--;
        }
        answer = String.valueOf(myStringArr);
        return answer;
    }
}