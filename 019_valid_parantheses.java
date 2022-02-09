import java.util.Stack;

class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char curr;
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
                continue;
            }
            if (curr == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (curr == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if (curr == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}

class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}