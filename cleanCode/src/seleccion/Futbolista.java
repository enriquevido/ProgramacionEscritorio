package seleccion;
//File name (primer letra mayuscula)
public class Futbolista extends Personal {
    //camelCase en nombre de variables
    private int numeroJugador;
    //Una sentencia por linea
    private String posicionCancha;

    //Especificar constructores
    public Futbolista(int id, String nombre, String apellido, int edad, int numeroJugador, String posicionCancha) {
        super(id, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicionCancha = posicionCancha;
    }

    //uso de anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose en juego.");
    }

    //uso de anotaciones
    @Override
    public void viajar() {
        System.out.println("Viajando para jugar.");
    }

    public void jugarPartido() {
        System.out.println("Jugando partido.");
    }

    public void entrenar() {
        System.out.println("Entrenando para mejorar.");
    }
}
