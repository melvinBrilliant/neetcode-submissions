class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> numStack = new ArrayDeque<>();
        for (String token : tokens) {
            boolean isOperator = token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/");
            if (isOperator) {
                int right = numStack.pop();
                int left = numStack.pop();
                switch (token) {
                    case "+" -> numStack.push(left + right);
                    case "-" -> numStack.push(left - right);
                    case "*" -> numStack.push(left * right);
                    case "/" -> numStack.push(left / right);
                }
            } else {
                numStack.push(Integer.parseInt(token));
            }
        }
        return numStack.pop();
    }
}
