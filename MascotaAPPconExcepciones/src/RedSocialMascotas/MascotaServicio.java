package RedSocialMascotas;

import java.util.ArrayList;

public class MascotaServicio {
        
     //lista de mascotas
     private ArrayList<Mascota> listaMascotas = new ArrayList();

     //getter del atributo lista
     public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

     //setter
     public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
     
    //crearMascota
    //método que permite crear una mascota pasándole como parámetro todos los atributos de la clase Mascota
                                                //*******clausula THROWS para indicar que el método lanza excepciones del tipo MascotaExcepciones
    public void crearMascota(String nombre, String tipo, String color, int edad) throws MascotaExcepciones{
        
  
 //por cada parámetro s va a validar la info ingresada
 //en caso que no cumpla conlas condiciones lanza la excepcion
        try{
            if(nombre.isEmpty()){
                //clausula THROW + NEW (crea el objeto de la clase de excepciones) + CONSTRUCTOR CON PARAM para pasarle el "MENSAJE" cuando se lance la excepcion
                throw new MascotaExcepciones("Debe indicar el nombre"); //valida que cada parámetro no se una cadena vacía
            }                                                             //si está vacía se lanza una excepción avisando
           
            /*Se crea un objeto excepcion para cada atributo de la clase
              Cuando se lanza la excepción, el resto del código no se ejecuta 
             (no se creará la mascota) y el flujo de ejecución salta al CATCH             */
            if(tipo.isEmpty()){
                throw new MascotaExcepciones("Debe indicar el tipo de mascota");
            }
            if(color.isEmpty()){
                throw new MascotaExcepciones("Debe indicar el color");
            }
            if(edad < 0){
                throw new MascotaExcepciones("Debe indicar la edad");
            }
            
            //crear objeto Mascota
            Mascota mascota = new Mascota();
            
            //Asignar valores al objeto
            mascota.setNombre(nombre);
            mascota.setTipo(tipo);
            mascota.setColor(color);
            mascota.setEdad(edad);
            
            //guardar mascota en la lista
            listaMascotas.add(mascota);
            
        }catch(MascotaExcepciones e){
            throw e;  //cuando se ejecute alguna excepcion, salta a la línea del CATCH y se captura la excepcion creada (MascotaExcepciones) para lanzarla
                      //se captura la excepcion creada para lanzarla hacia la clase que invocó el método (crearMascota)
        }catch(Exception e){  //se toma la precaución de utilizar CATCH con EXCEPTION para aquellas excepciones que no fueran contempladas...
            e.printStackTrace();
            throw new MascotaExcepciones("Error de sistema"); //...para devolver un mensaje más legible -> "error de sistema"
        
        }
 
 
        }
    
    
    public Mascota buscarMascota(String nombre)throws MascotaExcepciones{
        
        try{
            if(nombre.isEmpty()){      //valida si no se ingresó nombre para buscar
                throw new MascotaExcepciones("Debe indicar el nombre que desea buscar");
            }
            
            Mascota mascotaEncontrada=null;
            for (Mascota aux : listaMascotas) {
                if(aux.getNombre().equals(nombre)){
                    mascotaEncontrada=aux;
                    break;
                }
            }
            
            //Cuando no encuentre una mascota lanza la excepcion
            if(mascotaEncontrada == null){
                throw new MascotaExcepciones("No se encontró mascota con ese nombre");
            }
            
            return mascotaEncontrada;
        }catch(MascotaExcepciones e){
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw new MascotaExcepciones("Error del sistema");
        }
    }
    
    public void vaciarLista(){
        listaMascotas.clear();
    }
    
    public void mostrarLista() throws MascotaExcepciones{
        
        try{
            if (listaMascotas.isEmpty()){
                throw new MascotaExcepciones("lista vacía");
            }else{
                for (Mascota aux : listaMascotas) {
                    System.out.println("*****Datos de la mascota*****");
                    System.out.println(aux.getNombre());
                    System.out.println(aux.getTipo());
                    System.out.println(aux.getEdad());
                }
            }
        }catch(MascotaExcepciones e){
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw new MascotaExcepciones("Error del sistema");
        }
    }
}
