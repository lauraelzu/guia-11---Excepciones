/////////////////////////////////////////////
///////////////////////////Excepciones/////////
////////////////////////////////////////////

package erroralconvertircaracteraentero;

public class ErrorAlConvertirCaracterAEntero {

        public static void main(String[] args) {
        
 //           int valor1 = Integer.valueOf("a"); //valueOf sólo admite cadenas numéricas -> "3"
            
  /////////capturar excepciones individualmente POR EJ: NumberFormatException////////////////////
        
            int valor2 = 5;
            System.out.println("El entero se inicializó en: " + 5);
            
            try{
                valor2 = Integer.valueOf("a");
                System.out.println("El número indicado es: " + valor2); //sólo lo haría si la línea 19 no diera error
                
            }catch(NumberFormatException e){
                System.out.println("El valor indicado no es un número");
            }
            
  ///////////capturar todas las excepciones///////////
  
            try{
                int valor3 = Integer.valueOf("a");
                System.out.println("El número indicado es: " + valor3);
            }catch(Exception e){
                System.out.println("El valor indicado no es un número");
            }
///////////////////////////////////////////////////////////////////
//////////////////////////////finally/////////////////////////////
/////////////////////////////////////////////////////////////////
 
            try{
                int valor4 = Integer.valueOf("a");                        //se lanza la excepción!!!
                System.out.println("El número indicado es: " + valor4);
            }catch(NumberFormatException e){                              //<-- se captura este error
                System.out.println("El valor indicado no es un número");
            }catch(Exception e){
                System.out.println("El valor indicado no es un número");
            }finally{                                                     //se ejecuta el bloque "finally"     
                int valor5 = 7;
                System.out.println("El número indicado es: " + valor5);
            }
            
            
            
             try{
                int valor4 = Integer.valueOf("10");                        //es correcto así que no hay error
                System.out.println("El número indicado es: " + valor4);
            }catch(NumberFormatException e){                              
                System.out.println("El valor indicado no es un número");
            }catch(Exception e){
                System.out.println("El valor indicado no es un número");
            }finally{                                                    //pero también se ejecuta el bloque "finally"
                int valor5 = 7;
                System.out.println("El número indicado es: " + valor5);
            }
    }
    
}
