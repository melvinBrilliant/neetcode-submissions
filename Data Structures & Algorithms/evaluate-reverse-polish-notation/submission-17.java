class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> numStack = new ArrayDeque<>();
        for (var token : tokens) {
            boolean isOperator =
                token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
            if (isOperator) {
                int right = numStack.pop();
                int left = numStack.pop();
                switch (token) {
                    case "+":
                        numStack.push(left + right);
                        break;
                    case "-":
                        numStack.push(left - right);
                        break;
                    case "*":
                        numStack.push(left * right);
                        break;
                    case "/":
                        numStack.push(left / right);
                        break;
                }
            } else {
                numStack.push(Integer.parseInt(token));
            }
        }
        return numStack.peek();
    }
}
