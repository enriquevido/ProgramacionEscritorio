import java.io.*;

public class EliminaCadena {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java EliminaCadena <text> <fileName.rtf>");
            System.exit(1);
        }

        String text = args[0];
        String fileName = args[1];
        File fn = new File(fileName);

        if (!fn.exists() || !fn.isFile()) {
            System.out.println("Archivo no encontrado o no valido");
            System.exit(1);
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fn))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line.replace(text, "")).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fn))){
            bw.write(content.toString());
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se eliminaron las apariciones de la cadena: " + text);
    }
}
