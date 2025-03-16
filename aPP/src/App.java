import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        combinarExcepcion();
    }

    public static void miPrimeraExcepcion(){
        String dato = " ";
        int convertido;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero (leer y convertir)");
        dato = in.nextLine();

        try {
            convertido = Integer.parseInt(dato);
        } catch (Exception e) {
            System.out.println("El dato no es un numero, error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Ejecuta siempre el bloque - finally");
        }
    }

    public static void combinarExcepcion(){
        String datoLeido = " ";
        String datoAux = null;
        int datoConvertido;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un dato (leer)");
        datoLeido = in.nextLine();

        if (datoLeido.length() > 5) {
            datoAux = "UV";
        }
        try {
            int longitud = datoAux.length();
            datoConvertido = Integer.parseInt(datoAux);
        } catch (NullPointerException e) {
            System.out.println("Error, valor nulo");
        } catch (NumberFormatException e) {
            System.out.println("No es posible realizar la conversion");
        }
    }
}
