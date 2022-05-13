/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Gimena
 */
public class PersonaServicio {
    
    
    Scanner leer = new Scanner(System.in);
    
    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    
    public Persona crearPersona(){
        
    Persona persona= new Persona();
    
        System.out.println("Ingresá el nombre de la persona");
        persona.setNombre(leer.next());
        
        System.out.println("Ingresá la edad");
        persona.setEdad(leer.nextInt());
        
        
        boolean correcto=false;
        do{
        System.out.println("Ingresá el sexo");
        String sexo=leer.next();
        if (sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("H")||sexo.equalsIgnoreCase("O")) {
            
            persona.setSexo(sexo);
            correcto=true;
            
        } else {
            System.out.println("El sexo ingresado no es válido");
        }
        }while(!correcto);
        
        System.out.println("Ingresá la altura de la persona");
        persona.setAltura(leer.nextDouble());
        
        System.out.println("Ingresá el peso de la persona");
        persona.setPeso(leer.nextDouble());
        
        
        return persona;
     }
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
*/
    
    public int calcularIMC(Persona persona){
        
        double IMC=persona.getPeso()/(Math.pow(persona.getAltura(),2));
        int retorno=0; //IMC normal
    
        if (IMC<20) {
         retorno= -1 ;
        } 
        if (IMC>25) {
        retorno= -1;    
        }
        return retorno;
    }
    
    public boolean mayorEdad(Persona persona){
        boolean mayor=false;
        
        if (persona.getEdad()>=18) {
            
            mayor= true;
            
        }       
        return mayor;
    }
    
    public void mostrarResultados(int IMC[], boolean mayorEdad[]){
        
        int bajo = 0;
        int normal = 0;
        int sobrepeso = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < IMC.length; i++) {
            switch (IMC[i]) {
                case -1:
                    System.out.println("La persona " + (i+1) + " tiene bajo peso");
                    bajo++;
                    break;
                case 0:
                    System.out.println("La persona " + (i+1) + " está en su peso normal");
                    normal++;
                    break;
                case 1:
                    System.out.println("La persona " + (i+1) + " tiene sobrepeso");
                    sobrepeso++;
                    break;
            }

            if (mayorEdad[i] == true) {
                mayor++;
                System.out.println("La persona " + (i+1) + " es mayor de edad");
            } else {
                menor++;
                System.out.println("La persona " + (i+1) + " es menor de edad");

            }

        }
        
        
        System.out.println("El porcentaje de personas con bajopeso es: " + (100*bajo/4));
        System.out.println("El porcentaje de personas con peso normal es: " + (100*normal/4));
        System.out.println("El porcentaje de personas con bajopeso es: " + (100*sobrepeso/4));
        System.out.println("El porcentaje de personas mayor de edad es: " + (100*mayor/4));
        System.out.println("El porcentaje de personas menor de edad es: " + (100*menor/4));

        System.out.println("El porcentaje de personas con bajopeso es: " + (100*bajo/4));
        System.out.println("El porcentaje de personas con peso normal es: " + (100*normal/4));
        System.out.println("El porcentaje de personas con bajopeso es: " + (100*sobrepeso/4));
        System.out.println("El porcentaje de personas mayor de edad es: " + (100*mayor/4));
        System.out.println("El porcentaje de personas menor de edad es: " + (100*menor/4));
    }

    }
    
 