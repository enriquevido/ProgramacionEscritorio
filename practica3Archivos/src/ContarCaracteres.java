import java.io.*;

public class ContarCaracteres {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ContarCaracteres <fileName.rtf>");
            System.exit(1);
        }

        String fileName = args[0];
        File fn =  new File(fileName);

        if (!fn.exists() || !fn.isFile()) {
            System.out.println("Archivo no encontrado o no valido");
            System.exit(1);
        }

        int contadorCaracteres = 0;
        int contadorPalabras = 0;
        int contadorLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fn))) {
            String line;
            while ((line = br.readLine()) != null) {
                contadorLineas ++;
                contadorCaracteres += line.length();
                contadorPalabras += line.trim().isEmpty() ? 0 : line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Archivo: " + fileName);
        System.out.println("Numero de caracteres: " + contadorCaracteres);
        System.out.println("Numero de palabras: " + contadorPalabras);
        System.out.println("Numero de lineas: " + contadorLineas);
    }
}
