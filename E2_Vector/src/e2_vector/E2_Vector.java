
package e2_vector;

public class E2_Vector {

    
    public static void main(String[] args) {
        
        Vector vectorcito= new Vector();
        
        try{
        vectorcito.rellenarVector();
        }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Indice fuera de rango");
            
        }
        
        
    }
    
}
