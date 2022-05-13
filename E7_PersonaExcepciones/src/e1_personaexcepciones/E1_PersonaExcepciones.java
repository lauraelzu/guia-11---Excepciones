
package e1_personaexcepciones;

import entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author TIC-Laura
 */
public class E1_PersonaExcepciones {

   
    public static void main(String[] args) {
       

        PersonaServicio ps = new PersonaServicio();

        Persona persona1= null;
//        Persona persona2= ps.crearPersona();
//        Persona persona3= ps.crearPersona();
//        Persona persona4= ps.crearPersona();
        
        
        
        int IMC[] = new int[1];
        try{
        IMC[0] = ps.calcularIMC(persona1);
//        IMC[1] = ps.calcularIMC(persona2);
//        IMC[2] = ps.calcularIMC(persona3);
//        IMC[3] = ps.calcularIMC(persona4);

        boolean mayorEdad[] = new boolean[1];
       
        
        mayorEdad[0] = ps.mayorEdad(persona1);
//        mayorEdad[1] = ps.mayorEdad(persona2);
//        mayorEdad[2] = ps.mayorEdad(persona3);
//        mayorEdad[3] = ps.mayorEdad(persona4);

        ps.mostrarResultados(IMC, mayorEdad);
        }catch (NullPointerException e){
            
            System.out.println("el objeto fue inicilizado nulo");
        }
        

    }
    
}
