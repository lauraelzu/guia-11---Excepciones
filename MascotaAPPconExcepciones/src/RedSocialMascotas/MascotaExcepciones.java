/*
**********************************************
*********se crea la clase excepciones*********
**********************************************
 */
package RedSocialMascotas;

public class MascotaExcepciones extends Exception {

    //constructor vacío
    public MascotaExcepciones() {
    }

    //constructor con parámetro (mensaje que se quiere pasar)
    public MascotaExcepciones(String msg) {
        super(msg);
    }
}
