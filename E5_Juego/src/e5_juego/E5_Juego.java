
package e5_juego;

import java.util.InputMismatchException;
import java.util.Scanner;


public class E5_Juego {

    
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        int intentos=0;
        int nroIngresado=0;
        int nroAleatorio= (int) (Math.random()*500+1);
        System.out.println(nroAleatorio);
        
        do {
          System.out.println("Ingresá un nro");
          try {
          nroIngresado= sc.nextInt();
              System.out.println(nroIngresado);
          }catch(InputMismatchException e){
              
              System.out.println(nroIngresado );
            
          }
          finally{
            if (nroIngresado==nroAleatorio) {
                System.out.println("acertaste");
            }else{
                if (nroAleatorio>nroIngresado) {
                    System.out.println("El nro que buscas es mayor");
                }else{
                     System.out.println("El nro que buscas es menor");
                }
                intentos++;
            }
            
          }
        } while (nroAleatorio!=nroIngresado);
        
        
        System.out.println("has intentado: " + intentos + " veces");
        
        
    }
    
}
