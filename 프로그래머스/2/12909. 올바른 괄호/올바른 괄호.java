import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>(); 
        for (char c: s.toCharArray()) {
            if (stack.isEmpty() || c == '(') {
            stack.push(c);
            } else {
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}