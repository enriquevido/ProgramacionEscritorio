import seleccion.Entrenador;
import seleccion.Futbolista;
import seleccion.Masajista;

public class Main {
    public static void main(String[] args) {
        System.out.print("Leo messi está ");
        Futbolista leoMessi = new Futbolista(0001, "Leo", "Messi", 37, 10, "Extremo");
        leoMessi.entrenar();

        System.out.print("Pep Guardiola está ");
        Entrenador guardiola = new Entrenador(0002, "Pep", "Guardiola", 59, 150);
        guardiola.dirigirPartido();

        System.out.print("El masajista está ");
        Masajista masajista = new Masajista(0003, "Juan", "Sanchez", 40, "Quiropractico", 10);
        masajista.darMasaje();
    }
}
