/*
****************validación de loa información ingresada a través de excepciones*****************
 
Objetivos:
-legibilidad de código
-clases gestoras o servicios
-separar los metodos que realizan las acciones destacadas respecto de los métodos set y get
-crear, modificar y eliminar un objeto

*/
package mascotaappconexcepciones;

import RedSocialMascotas.MascotaExcepciones;
import RedSocialMascotas.MascotaServicio;

public class MascotaAPPconExcepciones {

    public static void main(String[] args) {
        
        //crear un objeto (una instancia de la clase MascotaServicio
        MascotaServicio ms = new MascotaServicio();
        
        try{
            //crear mascota con todos los valores OK
            ms.crearMascota("Pichicho", "caniche", "gris", 20);
       
            //se crea mascota con un valor vacío
//            ms.crearMascota("Toby", "", "negro", 2);
            
            //buscar una mascota por el nombre
//            ms.buscarMascota("Chiquito");

            //vaciar la lista para que salte error al mostrar la lista vacía
            ms.vaciarLista();
            ms.mostrarLista();
            
        }catch(MascotaExcepciones e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
            
    }
    
}
