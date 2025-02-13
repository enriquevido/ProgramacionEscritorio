package seleccion;
//File name (primer letra mayuscula)
public class Entrenador extends Personal {
    //camelCase en nombre de variables
    private int idFederacion;
    //Una sentencia por linea

    //Especificar constructores
    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion){
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    //uso de anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose para dirigir.");
    }

    //uso de anotaciones
    @Override
    public void viajar() {
        System.out.println("Viajando para dirigir partido.");
    }

    public void dirigirPartido() {
        System.out.println("Dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento.");
    }
}
