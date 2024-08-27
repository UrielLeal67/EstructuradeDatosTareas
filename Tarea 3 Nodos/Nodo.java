public class Nodo  
{
    int data;
    Nodo next;

    public Nodo(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class Main 
{
    private Nodo head;


    public Main() 
    {
        this.head = null;
    }

    
    public void add(int data)
     {
        Nodo newNode = new Nodo(data);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Nodo current = head;
            while (current.next != null)
             {
                current = current.next;
             }
            current.next = newNode;
        }
    }

    public void printList() 
    {
        Nodo current = head;
        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void updateThirdNode(int newData) 
    {
        if (head == null) return;

        Nodo current = head;
        int count = 1;

        while (current != null && count < 3) 
        {
            current = current.next;
            count++;
        }

        if (current != null) 
        {
            current.data = newData;
        }
    }

    public void insertAfter(int afterValue, int newValue)
     {
        Nodo current = head;

        while (current != null)
         {
            if (current.data == afterValue)
             {
                Nodo newNode = new Nodo(newValue);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void insertAtBeginning(int data) 
    {
        Nodo newNode = new Nodo(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) 
    {
        Main list = new Main();

        // Lista Original
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(600);

        // Imprimir la lista original usando while
        System.out.println("Lista:");
        list.printList();

        // Cambiar valor del 3er nodo de 300 a 333
        list.updateThirdNode(333);
        System.out.println("Después de cambiar el valor del 3er nodo de 300 a 333:");
        list.printList();

        // Insertar 700 después del nodo 600
        list.insertAfter(600, 700);
        System.out.println("Insertar el nodo 700 después del nodo 600:");
        list.printList();

        // Insertar nodo 50 al principio
        list.insertAtBeginning(50);
        System.out.println("Insertar el nodo 50 al principio:");
        list.printList();
    }
}
{
}
