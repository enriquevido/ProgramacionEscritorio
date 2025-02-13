package seleccion;
//File name (primer letra mayuscula)
public abstract class Personal {
    //camelCase en nombre de variables
    private int id;
    //Una sentencia por linea
    private String nombre;
    private String apellido;
    private int edad;

    //Especificar constructores
    Personal(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void concentrarse();

    public abstract void viajar();
}
