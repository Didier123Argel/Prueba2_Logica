
//Esta clase tiene dos metodos, una es para llenar el arreglo con el numero de filar y columnas ingresadas y 
//el otro metodo es usado para agregar recorrer el arreglo e imprimir el lugar donde acabo.

package prueba2logica;

public class Caracol {
    
    //Iniciamos las varibles de orientacion, en este caso solo derecha es true porque de allí partimos
    boolean derecha = true, izquierda = false, abajo = false;
    int x = 0, y = -1, bandera = 0, n = 0; 
    int filas, columnas;
    
    
    //Se crea un contructor que tomara como principal las filas y columnas para trabajar
    public Caracol (int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;      
        
    }
    
    //Llenamos el arreglo con el numero correspondiente
    public void posicion(){
    
        int[][] matriz = new int[filas][columnas];

       for( int i = 1; i <= columnas * filas; i++ ) { //Recorremos el tamaño del arreglo (clumnas*filas)
       
           
           if( izquierda ) {
         y --;
        if( y == -1 ) {
         y = 0; x --;
         izquierda = false;
      } 
        else { 
            if( matriz[ x ][ y ] != 0 ) {
        y ++; x --;
        izquierda = false;
            }
      }
    } 
       else 
           
       {
           if( derecha ) {
      y ++;
      if( y == columnas ) {
        y = columnas - 1; x ++;
        derecha = false;
        abajo = true;
      } 
      else {
          if( matriz[ x ][ y ] != 0 ) {
        y --; x ++;
        derecha = false;
        abajo = true;
       }
      }
    } 
           else{
               
               if( abajo ) { 
      x ++;
      if( x == filas ) {
        x = filas - 1; y --;
        abajo = false;
        izquierda = true;
      } 
      else if( matriz[ x ][ y ] != 0 ) {
        y --; x --;
        abajo = false;
        izquierda = true;
      }
    } 
       else {
      x --;
      if( x == -1 || matriz[ x ][ y ] != 0 ) {
        x ++; y ++;
        derecha = true;
      }
    }
       }
    }
    matriz[ x ][ y ] = i;
  }

  for( int i = 0; i < filas; i++ ) {
    for( int j = 0; j < columnas; j++ ) {
      System.out.print( matriz[ i ][ j ] + "\t" );
    }
    System.out.println();
  }
  
  recorrer(matriz);  
    }
    
    
    
    
    public void recorrer(int [][] matriz){
      
      x = 0;
      y = 0;
      int num_elementos = matriz.length * matriz[0].length;
 
     
     
      while (n < num_elementos) {
       
         switch (bandera) { //cada caso detemina donde se termina mirando
         case 0:
            for (int i = x; i < matriz[0].length - y; i++) {
               n++;    
               
               if (num_elementos==n){
                System.out.println("Termino en " + matriz[x][i]+ " mirando hacia la derecha");
                
               }
               
     
            }
            bandera++;
            break;
 
         case 1: 
            for (int i = x + 1; i < matriz.length - x; i++) {
               n++;
               if (num_elementos==0){
               System.out.println("Termino en " + matriz[i][matriz[0].length - 1 - y]+" mirando hacia abajo");
               

               }
               
            }
            bandera++;
            break;
 
         case 2: 
            for (int i = matriz[0].length - 2 - y; i >= y; i--) {   
               n++;     
               
               if (num_elementos==n){
               System.out.println("Termino en " + matriz[matriz.length - 1 - x][i]+" mirando hacia la izquierda");
               }
                   
            }
              
              
            bandera++;
            break;
 
         case 3: 
            for (int i = matriz.length - 2 - x; i >= x + 1; i--) {
              
               n++;   
               if (num_elementos==n){
               
                System.out.println("Termina en " + matriz[i][y]+" mirando hacia arriba");   

               }
             
            }
            bandera = 0;
            x++;
            y++;
            break;
         }
     
      }  
     }
    }
