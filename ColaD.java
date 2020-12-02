package colas;

public class ColaD {

    private Nodo inicioCola, finCola;
    String Cola = "";

    public ColaD() {
        inicioCola = null;
        finCola = null;
    }

    public boolean ColaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Insertar(int informacion) {
        Nodo nuevo = new Nodo();
        nuevo.setElemento(informacion);
        nuevo.setSiguiente(nuevo);

        if (ColaVacia()) {
            inicioCola = nuevo;
            finCola = nuevo;
        } else {
            finCola.setSiguiente(nuevo);
            finCola = nuevo;
        }
    }

    public int Eliminar() {
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;

            if (inicioCola == finCola) {
                inicioCola = null;
                finCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        }
        return 0;
    }

    public void Mostrar() {
        Nodo recorrido = inicioCola;
        

        while (recorrido != null) {
            System.out.println(recorrido.informacion);
            recorrido = recorrido.siguiente;
        }

    }
}
