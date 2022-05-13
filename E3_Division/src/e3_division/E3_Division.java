
package e3_division;

import java.util.Scanner;


public class E3_Division {

    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos numeros para dividir");
        
        String n1= sc.next();
        String n2= sc.next();
        
        DivisionNumero dn= new DivisionNumero();
        
        try{
        dn.dividendo= Integer.parseInt(n1);
        dn.divisor= Integer.parseInt(n2);
        
        System.out.println("El resultado de la division es: " + dn.dividendo/dn.divisor);
        } catch(NumberFormatException e){
            System.out.println("Ha ingresado un caracter que no es un nro");
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }
    }
    
}
