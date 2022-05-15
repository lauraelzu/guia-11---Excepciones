/*
cuando un sospechoco llega para ser interrogado, se registra con un ID, un nombre que es 
"Sospechoso" + ID, una descripción que lo identifica y un boolean culpable.
(Ante la ley, todo sospecho es inocente hasta que se demuestre lo contrario"
Crear una lista de sospechosos.
Crear un método que compare el ID de la pista con los ID de los sospechosos
 */
package ejemploexcepbuscarcriminal;

import Entidad.Sospechoso;
import Servicio.SospechosoServicio;
import java.util.InputMismatchException;
import java.util.List;

public class EjemploExcepBuscarCriminal {

    public static void main(String[] args) {
        
        SospechosoServicio ss = new SospechosoServicio();
       
        //crear lista para guardar los 5 sospechosos que devuelve el método registrarSospechosos
        List<Sospechoso> ListaDeSospechosos = ss.registrarSospechosos();
        
//        ********************buscar el criminal con ID 2 que está en la lista**************************************
//        System.out.println("\nSe busca al criminial con ID = 2 (hardcodeado)");
//        Integer idCriminal = 2;      
//        Sospechoso culpable = ss.atraparSospechoso(ListaDeSospechosos, idCriminal);       
//        System.out.println("Está entre los sospechosos. Se ha apresado a: " + culpable.toString());
        
        //***************buscar un criminal 0 que no está en la lista, 
        // **********************el método toString -> lanza el error NullPointerException************
//        System.out.println("\nSe busca al criminial con ID = 0 (hardcodeado)");
//        Integer idCriminal2 = 0;
//        Sospechoso culpable2 = ss.atraparSospechoso(ListaDeSospechosos, idCriminal2);
//        System.out.println("Está entre los sospechosos. Se ha apresado a: " + culpable2.toString());
//        
        
        //Con manejo de error NullPointerException 
        //al no encontrar al culpable y que no interrumpa la ejecución del programa
//        System.out.println("\nSe busca al criminial con ID =0");
//        Integer idCriminal3 = 0;
//        
//        try{
//            Sospechoso culpable3 = ss.atraparSospechoso(ListaDeSospechosos, idCriminal3);
//            System.out.println("Está entre los sospechosos. Se ha apresado a: " + culpable3.toString());
//        }catch (NullPointerException e){
//            System.out.println("-->e.printStackTrace() devuelve..");
//            e.printStackTrace();
//            System.out.println("getMessage: -> " + e.getMessage());
//            System.out.println("toString: -> " + e.toString());
//        }


        System.out.println("\nProceso de búsqueda de un criminial");
        
        Integer idCriminal = ss.ingresarIdPorTeclado();
        
        try{
            Sospechoso culpable = ss.atraparSospechoso(ListaDeSospechosos, idCriminal);
            System.out.println("Se encuentra entre los sospechosos. Se ha apresado a: " + culpable.toString());
        }catch (NullPointerException e){
            System.out.println("-->e.printStackTrace() devuelve..");
            e.printStackTrace();
            System.out.println("getMessage: -> " + e.getMessage());
            System.out.println("toString: -> " + e.toString());
        }

    }
    
}
