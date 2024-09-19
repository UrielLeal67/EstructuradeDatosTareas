import java.util.LinkedList;
import java.util.Queue;

public class ColaADT <T> {
    private Queue<T> cola;

    public ColaADT() {
        cola = new LinkedList<>();
    }


    public void encolar(T elemento) {
        cola.offer(elemento);
    }


    public T desencolar() {
        return cola.poll();
    }


    public T frente() {
        return cola.peek();
    }


    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            for (T paciente : cola) {
                System.out.println(paciente);
            }
        }
    }


    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
