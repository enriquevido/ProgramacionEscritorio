public class Main {
    public static void main(String[] args) {
        if (args.length !=  3) {
            System.out.println("Usage: java Main operand1 operator operand2");
            System.exit(1);
        }

        Calculator calculator = new Calculator();
        calculator.DetermineOperation(args[0], String.valueOf(args[1].charAt(0)), args[2]);
    }
}
