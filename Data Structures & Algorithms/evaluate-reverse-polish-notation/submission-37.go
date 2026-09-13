func evalRPN(tokens []string) int {
    var stack []int
    for _, token := range tokens {
        isOperator := token == "+" || token == "-" || token == "*" || token == "/"
        if isOperator {
            right := pop(&stack)
            left := pop(&stack)
            switch token {
                case "+":
                    stack = append(stack, left + right)
                case "-":
                    stack = append(stack, left - right)
                case "*":
                    stack = append(stack, left * right)
                case "/":
                    stack = append(stack, left / right)
            }
        } else {
            parsed, _ := strconv.Atoi(token)
            stack = append(stack, parsed)
        }
    }
    return stack[0]
}

func pop(stack *[]int) int {
    e := (*stack)[len(*stack) - 1]
    *stack = (*stack)[0:len(*stack) - 1]
    return e
}
