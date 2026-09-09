class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numStack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
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
        return numStack.peek();
    }
}
