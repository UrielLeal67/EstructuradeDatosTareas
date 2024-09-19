public class Clinica {
    public static void main(String[] args) {
        ColaADT<Paciente> colaPacientes = new ColaADT<>();


        Paciente p1 = new Paciente("Josselin Leal", 19 , "Dolor de cabeza");
        Paciente p2 = new Paciente("Nancy Sanchez", 38 , "Fiebre");
        Paciente p3 = new Paciente("Mario Leal", 37 , "Dolor abdominal");

        colaPacientes.encolar(p1);
        colaPacientes.encolar(p2);
        colaPacientes.encolar(p3);


        System.out.println("Estado inicial de la cola:");
        colaPacientes.mostrarCola();


        System.out.println("\nEl siguiente paciente es: " + colaPacientes.frente());


        System.out.println("\nAtendiendo al siguiente paciente: " + colaPacientes.desencolar());


        System.out.println("\nEstado de la cola después de atender al paciente:");
        colaPacientes.mostrarCola();


        Paciente p4 = new Paciente("Ana Martínez", 35, "Tos");
        Paciente p5 = new Paciente("Luis Hernández", 50, "Dolor de espalda");

        colaPacientes.encolar(p4);
        colaPacientes.encolar(p5);


        System.out.println("\nEl siguiente paciente es: " + colaPacientes.frente());

        System.out.println("\nAtendiendo al siguiente paciente: " + colaPacientes.desencolar());


        System.out.println("\nEstado de la cola después de atender al paciente:");
        colaPacientes.mostrarCola();
    }
}
