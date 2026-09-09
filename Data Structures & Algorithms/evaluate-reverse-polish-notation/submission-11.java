class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        for (String token : tokens) {
            boolean isNotOperator = !token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/");
            if (isNotOperator) {
                numStack.push(Integer.parseInt(token));
            } else {
                int right = numStack.pop();
                int left = numStack.pop();
                if (token.equals("+")) {
                    numStack.push(left + right);
                } else if (token.equals("-")) {
                    numStack.push(left - right);
                } else if (token.equals("*")) {
                    numStack.push(left * right);
                } else if (token.equals("/")) {
                    numStack.push(left / right);
                }
            }
        }
        return numStack.pop();
    }
}
