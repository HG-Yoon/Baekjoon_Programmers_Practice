import java.util.*;

class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] parts = s.split(" ");
            Stack<Integer> stack = new Stack<>();

            // 1. 문자열을 순회하며 스택에 숫자 처리
            for (String part : parts) {
                // "Z"를 만나면 스택에서 숫자 하나를 제거합니다.
                if (part.equals("Z")) {
                    // 스택이 비어있지 않을 때만 pop을 호출하는 것이 안전합니다.
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } // "Z"가 아니면 숫자로 변환하여 스택에 추가합니다.
                else {
                    stack.push(Integer.parseInt(part));
                }
            }

            // 2. 스택에 남아있는 모든 숫자를 더합니다.
            // for문 대신 while문을 사용해 스택이 빌 때까지 모든 요소를 더합니다.
            while (!stack.isEmpty()) {
                answer += stack.pop();
            }
            
            return answer;
        }
    }