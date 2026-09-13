class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let stack = []
        for (let token of tokens) {
            let isOperator = token === "+" ||
                token === "-" ||
                token === "*" ||
                token === "/";
            if (isOperator) {
                let right = stack.pop();
                let left = stack.pop();
                switch (token) {
                    case "+": stack.push(left + right); break;
                    case "-": stack.push(left - right); break;
                    case "*": stack.push(left * right); break;
                    case "/": stack.push(Math.trunc(left / right)); break;
                }
            } else {
                stack.push(Number(token));
            }
        }
        return stack.pop();
    }
}
