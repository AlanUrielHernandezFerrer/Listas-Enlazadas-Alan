/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajolistaenlazada;

/**
 *
 * @author Alan
 */
public class Lista {

    //Declaración de atributos

    private Nodo i;
    private Nodo f;

    //Constructos de la clase Lista
    public Lista() {
        i = f = null;
    }

    //Metodo para agregar un nodo al final
    public void agregarFin(int info) {

        Nodo nuevo = new Nodo(info, null);

        if (i == null) {
            i = f = nuevo;
        } else {
            f.setSiguiente(nuevo);
            f = nuevo;
        }

    }

    //Metodo para imprimir los datos
    public void imprimir() {
        Nodo auxiliar = i;
        while (auxiliar != null) {
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
    }

    //Metodo apra eliminar los valores que superen un valor dado
    public void eliminar(int valor) {
        Nodo anterior = i;
        Nodo auxiliar = i.getSiguiente();
        Nodo temp;
        while (auxiliar != null) {
            //Condicional simple para eliminacion de nodos
            if (auxiliar.getDato() > valor) {
                temp = auxiliar.getSiguiente();
                anterior.setSiguiente(auxiliar.getSiguiente());
                auxiliar = temp;
            } else {
                anterior = anterior.getSiguiente();
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

}
