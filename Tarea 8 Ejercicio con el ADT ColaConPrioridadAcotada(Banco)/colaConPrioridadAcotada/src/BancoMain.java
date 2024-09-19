public class BancoMain {
    public static void main(String[] args) {
        ColaConPrioridadAcotada cola = new ColaConPrioridadAcotada();


        cola.agregar(new ClienteBanco("Cliente Nuevo 1", 4));
        cola.agregar(new ClienteBanco("Cliente Nuevo 2", 4));


        cola.agregar(new ClienteBanco("No Cliente 1", 5));
        cola.agregar(new ClienteBanco("No Cliente 2", 5));
        cola.agregar(new ClienteBanco("No Cliente 3", 5));


        cola.agregar(new ClienteBanco("Celebridad", 1));


        cola.imprimirEstado();


        ClienteBanco atendido = cola.atender();
        System.out.println("Atendido: " + atendido.getNombre() + ", Retirado: $10,000");


        cola.agregar(new ClienteBanco("Cliente Frecuente", 3));
        cola.agregar(new ClienteBanco("Cliente Premium", 2));


        atendido = cola.atender();
        System.out.println("Atendido: " + atendido.getNombre());


        cola.imprimirEstado();


        while (!cola.estaVacia()) {
            atendido = cola.atender();
            System.out.println("Atendido: " + atendido.getNombre());
        }


        cola.imprimirEstado();
    }
}
