public class Calculator implements CalculatorMethods {
    @Override
    public void DetermineOperation(String operand1, String operator, String operand2){
        int num1 = Integer.parseInt(operand1);
        int num2 = Integer.parseInt(operand2);
        int result = 0;
        switch (operator.charAt(0)) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 == 0 || num2 == 0) System.out.println("divide by zero");
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        System.out.println(operand1 + operator + operand2 + " = " + result);
    }
}
