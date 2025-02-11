import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la votación para representante maestro.");
        System.out.println("¿Cuántos maestros participarán en la votación?");
        int numMaestros= sc.nextInt();
        Maestro array[] = new Maestro[numMaestros];

        for (int i = 0; i < numMaestros; i++) {
            System.out.println("Ingresa la siguiente información del maestro " + (i+1) + ":");
            System.out.print("Nombre: ");
            String nombreMaestro = sc.next();
            array[i] = new Maestro(nombreMaestro);
            System.out.println("ID asignado: " + array[i].getMaestroId());
        }

        System.out.print("Ingrese el número de votantes: ");
        int numVotantes = sc.nextInt();


        for (int i = 0; i < numVotantes; i++) {
            System.out.println("Lista de candidatos:");
            for (int j = 0; j < numMaestros; j++) {
                System.out.println("Nombre maestro: " + array[j].getName());
                System.out.println("ID: " + array[j].getMaestroId());
            }
            System.out.print("Votante " + (i + 1) + ", ingrese el ID del maestro por el que vota o 0 para terminar antes: ");
            String idVoto = sc.next();

            if (idVoto.equals("0")) { // Opción para terminar antes
                System.out.println("Votación finalizada anticipadamente.");
                break;
            }

            boolean votoRegistrado = false;
            for (Maestro maestro : array) {
                if (maestro.getMaestroId().equals(idVoto)) {
                    maestro.incrementarVoto();
                    votoRegistrado = true;
                    break;
                }
            }

            if (!votoRegistrado) {
                System.out.println("ID no válido, el voto no fue registrado.");
            }
        }

        System.out.println("\nResultados de la votación:");
        Maestro ganador = array[0];
        for (Maestro maestro : array) {
            double porcentaje = (numVotantes > 0) ? (maestro.getContVotos() * 100.0 / numVotantes) : 0;
            System.out.printf("%s (ID: %s) - Votos: %d - Porcentaje: %.2f%%\n",
                    maestro.getName(), maestro.getMaestroId(), maestro.getContVotos(), porcentaje);

            if (maestro.getContVotos() > ganador.getContVotos()) {
                ganador = maestro;
            }
        }

        System.out.println("\nEl representante maestro elegido es: " + ganador.getName() +
                " con " + ganador.getContVotos() + " votos (" +
                String.format("%.2f", (ganador.getContVotos() * 100.0 / numVotantes)) + "%).");
        sc.close();
    }
}
