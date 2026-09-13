class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            boolean isOperator = token.equals("+") ||
                    token.equals("-") ||
                    token.equals("*") ||
                    token.equals("/");
            if (isOperator) {
                int right = stack.pop();
                int left = stack.pop();
                switch (token) {
                    case "+" : stack.push(left + right); break;
                    case "-" : stack.push(left - right); break;
                    case "*" : stack.push(left * right); break;
                    case "/" : stack.push(left / right); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
