package listaLigada;

class Nodo
{
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor)
    {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaLigada
{
    private Nodo head;
    private int tamanio;

    public ListaLigada()
    {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia()
    {
        return head == null;
    }

    public int getTamanio()
    {
        return tamanio;
    }

    public void agregarAlFinal(Object valor)
    {
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia())
        {
            head = nuevoNodo;
        } else
        {
            Nodo temp = head;
            while (temp.siguiente != null)
            {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
        tamanio++;
    }

    public void agregarAlInicio(Object valor)
    {
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia())
        {
            head = nuevoNodo;
        } else
        {
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        }
        tamanio++;
    }

    public void agregarDespuesDe(Object referencia, Object valor)
    {
        Nodo temp = head;
        while (temp != null && !temp.valor.equals(referencia))
        {
            temp = temp.siguiente;
        }
        if (temp != null)
        {
            Nodo nuevoNodo = new Nodo(valor);
            nuevoNodo.siguiente = temp.siguiente;
            temp.siguiente = nuevoNodo;
            tamanio++;
        }
    }

    public void eliminar(int posicion)
    {
        if (posicion < 0 || posicion >= tamanio)
        {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        if (posicion == 0)
        {
            head = head.siguiente;
        } else
        {
            Nodo temp = head;
            for (int i = 0; i < posicion - 1; i++)
            {
                temp = temp.siguiente;
            }
            temp.siguiente = temp.siguiente.siguiente;
        }
        tamanio--;
    }

    public void eliminarElPrimero()
    {
        if (!estaVacia())
        {
            head = head.siguiente;
            tamanio--;
        }
    }

    public void eliminarElFinal()
    {
        if (estaVacia()) return;

        if (tamanio == 1)
        {
            head = null;
        } else
        {
            Nodo temp = head;
            while (temp.siguiente.siguiente != null)
            {
                temp = temp.siguiente;
            }
            temp.siguiente = null;
        }
        tamanio--;
    }

    public int buscar(Object valor)
    {
        Nodo temp = head;
        int posicion = 0;
        while (temp != null)
        {
            if (temp.valor.equals(valor))
            {
                return posicion;
            }
            temp = temp.siguiente;
            posicion++;
        }
        return -1; // No encontrado
    }

    public void actualizar(Object aBuscar, Object valor)
    {
        Nodo temp = head;
        while (temp != null)
        {
            if (temp.valor.equals(aBuscar))
            {
                temp.valor = valor;
                return;
            }
            temp = temp.siguiente;
        }
    }

    public void transversal()
    {
        Nodo temp = head;
        while (temp != null)
        {
            System.out.println(temp.valor);
            temp = temp.siguiente;
        }
    }
}
