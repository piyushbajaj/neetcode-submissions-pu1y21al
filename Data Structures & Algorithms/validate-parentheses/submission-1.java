class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character currPeek = stack.peek();
                if (ch == ')' && currPeek.equals('(')) {
                    stack.pop();
                } else if (ch == '}' && currPeek.equals('{')) {
                    stack.pop();
                } else if (ch == ']' && currPeek.equals('[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
