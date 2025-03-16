public class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    //Rename Method
    public void printNumbers(int from, int to) throws NumberFormatException {
        for (int i = from; i <= to; i++) {
            //Replace Nested Conditional with Guard Clauses
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                //Control Flag
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            else {
                System.out.println(i);
                continue;
            }
        }
    }
}
