import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else stack.pop();
            }
            else stack.push(c);
        }
            if (!stack.isEmpty()) answer = false;
        return answer;
    }
}