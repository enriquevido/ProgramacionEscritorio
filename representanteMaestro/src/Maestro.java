public class Maestro {
    private static int contadorID = 1; // Contador estático para generar IDs únicos
    private String maestroId;
    private String name;
    private int contVotos;

    Maestro(String name) {
        this.maestroId = String.format("%04d", contadorID++);
        this.name = name;
        this.contVotos = 0;
    }

    public String getMaestroId() {
        return maestroId;
    }

    public void incrementarVoto() {
        this.contVotos++;
    }

    public int getContVotos() {
        return contVotos;
    }

    public String getName() {
        return name;
    }

}
