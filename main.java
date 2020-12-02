package colas;

import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opc, nodo = 0;
       

        ColaD cola = new ColaD();

        do {
            System.out.println("Menu");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            System.out.println("");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese datos:");
                    nodo = leer.nextInt();
                    cola.Insertar(nodo);

                    break;

                case 2:
                    if (!cola.ColaVacia()) {
                        System.out.println("Dato eliminado");
                    } else {
                        System.out.println("Cola vacia");
                    }

                    break;
                case 3:
                    cola.Mostrar();

                    break;
                case 4:
                    System.out.println("Usted ha salido");

                    break;

                default:
                    System.out.println("Opciones no validas");
                    break;

            }
        } while (opc != 4);
    }

}
