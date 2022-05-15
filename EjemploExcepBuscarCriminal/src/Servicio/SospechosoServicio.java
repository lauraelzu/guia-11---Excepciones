/*
Crear un método que compare el ID de la pista con los ID de los sospechosos
Manejar excepciones en caso de ingresar mal el ID que se busca
 */
package Servicio;

import Entidad.Sospechoso;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class SospechosoServicio {
    
    //crear lista de sospechosos
    
    public List<Sospechoso> registrarSospechosos(){
        
        List<Sospechoso> listaDeSospechosos = new ArrayList<>();
        
        Sospechoso sospechoso1 = new Sospechoso(1, "tatuaje", "pelo rojo");
        listaDeSospechosos.add(sospechoso1);
        Sospechoso sospechoso2 = new Sospechoso(2, "tatuaje", "pelo negro");
        listaDeSospechosos.add(sospechoso2);
        Sospechoso sospechoso3 = new Sospechoso(3, "joya", "pelo rubio");
        listaDeSospechosos.add(sospechoso3);
        Sospechoso sospechoso4 = new Sospechoso(4, "diente de oro", "pelo rosa");
        listaDeSospechosos.add(sospechoso4);
        Sospechoso sospechoso5 = new Sospechoso(5, "cicatriz", "pelo negro");
        listaDeSospechosos.add(sospechoso5);
       
        System.out.println("Se han ingresado " + listaDeSospechosos.size() + " sospechosos.");
        
        return listaDeSospechosos;
    }
    
    
    //buscar el criminal según ID dentro de la lista de sospechoso
    public Sospechoso atraparSospechoso(List<Sospechoso> listaDeSospechosos, Integer id){
        
        System.out.println("Se inicia el proceso para apresar al sospechoso según su ID");
        
        int size = listaDeSospechosos.size();
        for (int i = 0; i < size; i++) {
            if(listaDeSospechosos.get(i).getId() == id){
                System.out.println("El sospechoso " + id + " es culpable");
                listaDeSospechosos.get(i).setCulpable(true);
                return listaDeSospechosos.get(i);
            }
        }
        System.out.println("La pista era falsa. El criminal se escapó");
        return null;
    }
    
    
     //Pedir ingreso por teclado del ID del criminal buscado 
    public Integer ingresarIdPorTeclado(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer id=0;
        System.out.println("Ingrese ID del criminal buscado");
        
        try{
            id = leer.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ID incorrecta!!!");
            id = ingresarIdPorTeclado();
        }
        return id;
    }
    
    
}
