class Solution {
    public int calPoints(String[] operations) {
        if (operations.length == 0) {
            return 0;
        }
        Stack<Integer> scores = new Stack<>();
        for (String operation : operations) {
            if (operation.matches("-?\\d+")) {
                scores.push(Integer.parseInt(operation));
            } else if (operation.equals("+")) {
                int top = scores.pop();
                int newTop = scores.peek();
                scores.push(top);
                scores.push(top + newTop); 
            } else if (operation.equals("C")) {
                scores.pop();
            } else if (operation.equals("D")) {
                scores.push(2 * scores.peek());
            }
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
}