package RedSocialMascotas;

public class Mascota {
    
    private String nombre;
    private String tipo;      
    private String color;
    private int edad;
   
    public Mascota() {
    }

    public Mascota(String nombre, String tipo, String color, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
    
    
    
}
