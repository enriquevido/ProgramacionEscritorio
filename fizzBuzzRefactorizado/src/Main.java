public class Main {
    public static void main(String[] args) {
        ConsoleBasedFizzBuzz prueba = new ConsoleBasedFizzBuzz();
        // Replace Error Code With Exception
        try {
            prueba.printNumbers(1, 100);
        }
        catch (NumberFormatException e) {
            System.out.println("No se pueden imprimir los numeros.");
        }
        finally {
            System.out.println("Ejecución finalizada.");
        }
    }
}
