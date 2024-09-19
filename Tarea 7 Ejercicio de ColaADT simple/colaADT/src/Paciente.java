public class Paciente {
    private String nombre;
    private int edad;
    private String motivoConsulta;

    public Paciente(String nombre, int edad, String motivoConsulta) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Edad: " + edad + ", Motivo: " + motivoConsulta;
    }
}
