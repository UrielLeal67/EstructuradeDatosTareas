package listaLigada;

public class main
{
    public static void main(String[] args)
    {
        ListaLigada lista = new ListaLigada();

        // Agregar 5 SmartPhones
        lista.agregarAlFinal(new SmartPhone("Apple", "iPhone 15 proMax", 999.99));
        lista.agregarAlFinal(new SmartPhone("Samsung", "Galaxy S23", 799.99));
        lista.agregarAlFinal(new SmartPhone("Google", "Pixel 6", 599.99));
        lista.agregarAlFinal(new SmartPhone("OnePlus", "9 Pro", 729.99));
        lista.agregarAlFinal(new SmartPhone("Xiaomi", "Mi 11", 699.99));

        // Imprimir contenido
        System.out.println("Contenido inicial:");
        lista.transversal();

        // Eliminar el de la posición 2
        lista.eliminar(2);
        System.out.println("\nDespués de eliminar el elemento en la posición 2:");
        lista.transversal();

        // Actualizar el segundo elemento
        lista.actualizar(new SmartPhone("Samsung", "Galaxy S23", 799.99), new SmartPhone("Samsung", "Galaxy S24", 899.99));
        System.out.println("\nDespués de actualizar el segundo elemento:");
        lista.transversal();

        // Agregar un elemento al inicio y otro al final
        lista.agregarAlInicio(new SmartPhone("Sony", "Xperia 5", 649.99));
        lista.agregarAlFinal(new SmartPhone("Huawei", "P50", 599.99));
        System.out.println("\nDespués de agregar al inicio y al final:");
        lista.transversal();

        // Eliminar el primero
        lista.eliminarElPrimero();
        System.out.println("\nDespués de eliminar el primero:");
        lista.transversal();
    }
}
