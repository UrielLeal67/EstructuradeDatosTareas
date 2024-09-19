import java.util.PriorityQueue;

public class ColaConPrioridadAcotada {
    private PriorityQueue<ClienteBanco> cola;

    public ColaConPrioridadAcotada() {
        cola = new PriorityQueue<>((a, b) -> Integer.compare(a.getPrioridad(), b.getPrioridad()));
    }

    public void agregar(ClienteBanco cliente) {
        cola.add(cliente);
    }

    public ClienteBanco atender() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void imprimirEstado() {
        System.out.println("Estado de la cola:");
        for (ClienteBanco cliente : cola) {
            System.out.println(cliente);
        }
    }
}
