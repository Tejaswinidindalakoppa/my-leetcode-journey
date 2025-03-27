class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String token : tokens) {
            if ("+-*/".contains(token)) { // Check if token is an operator
                int num2 = stack.pop(); // Retrieve the top two numbers
                int num1 = stack.pop();
                stack.push(applyOperation(token, num1, num2));
            } else {
                stack.push(Integer.parseInt(token)); // Parse and push numbers
            }
        }
        
        return stack.pop(); // Final result
    }
    
    private int applyOperation(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2; // Integer division
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}