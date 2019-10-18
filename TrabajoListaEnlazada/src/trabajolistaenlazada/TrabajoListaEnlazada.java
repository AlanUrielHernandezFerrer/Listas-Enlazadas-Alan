package trabajolistaenlazada;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TrabajoListaEnlazada {

    public static int leerEntero(String linea) {
        Scanner leer = new Scanner(System.in);
        System.out.println(linea);
        int dato = leer.nextInt();
        return dato;
    }

    public static void main(String[] args) {
        Lista coleccion = new Lista();
        int opcion;
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Que opcion deseas hacer"+
                    "\n 1.- Ingresar datos a la lista"+
                    "\n 2.- Imprimir Lista"+
                    "\n 3.- Eliminar datos que se pasan de un limite."+
                    "\n 4.- Imprimir otra vez la lista:"+
                    "\n 5.- Salir"));
            

            switch (opcion) {
                case 1: {
                   
                    int nuevo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento que desee ingresar a la lista:"));
                    coleccion.agregarFin(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista ingresada es:");
                    coleccion.imprimir();
                    break;
                }
                case 3: {
                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor que supere su  limite:"));
                    coleccion.eliminar(valor);
                    break;
                }
                case 4: {
                    
                    System.out.println("Imprimir otra vez la lista:");
                    coleccion.imprimir();
                    break;
                    
                }
                case 5:{
                    System.out.println("Salir");
                    break;
                
                }
            }
        } while (opcion != 5);
    }
}
