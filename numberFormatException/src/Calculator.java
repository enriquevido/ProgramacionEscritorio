public class Calculator implements CalculatorMethods {
    @Override
    public void DetermineOperation(String operand1, String operator, String operand2)
            throws NumberFormatException, ArithmeticException {
        try {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int result = switch (operator.charAt(0)) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> {
                    if (num1 == 0 || num2 == 0) throw new ArithmeticException("Divide by zero");
                    yield num1 / num2;
                }
                default -> throw new NumberFormatException("Invalid operator: " + operator);
            };

            System.out.println(operand1 + operator + operand2 + " = " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
