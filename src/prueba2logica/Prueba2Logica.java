
package prueba2logica;

import java.util.Scanner;

public class Prueba2Logica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //agregarmos n cantidad de filas
        System.out.print("Ingrese numero de filas: ");
        int filas = sc.nextInt();
        //agregarmos m cantidad de columnas

        System.out.print("Ingrese numero de columnas: ");
        int columnas = sc.nextInt();
        
        
        //Llamamos al metodo Caracol que se encarga de cacular
        //al instanciarla necesitamos ingresar las filas y 
        Caracol caracol= new Caracol(filas, columnas);
        caracol.posicion();
        
    }
    
}