package seleccion;
//File name (primer letra mayuscula)
public class Masajista extends Personal {
    //camelCase en nombre de variables
    private String profesion;
    //Una sentencia por linea
    private int aniosExp;

    //Especificar constructores
    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int aniosExp) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExp = aniosExp;
    }

    //uso de anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose en masajear.");
    }

    //uso de anotacionesq
    @Override
    public void viajar() {
        System.out.println("Viajar para masajear.");
    }

    public void darMasaje() {
        System.out.println("Dando un masaje.");
    }
}
