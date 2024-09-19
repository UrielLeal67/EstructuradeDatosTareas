public class ClienteBanco {
    private String nombre;
    private int prioridad; // Nivel de prioridad: 1 a 5

    public ClienteBanco(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}
