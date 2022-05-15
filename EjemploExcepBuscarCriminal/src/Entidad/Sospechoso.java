/*
cuando un sospechoco llega para ser interrogado, se registra con un ID, un nombre que es 
"Sospechoso" + ID, una descripción que lo identifica y un boolean culpable.
(Ante la ley, todo sospecho es inocente hasta que se demuestre lo contrario"
 */
package Entidad;

public class Sospechoso {
    private Integer id;
    private String nombre;
    private boolean culpable;
    private String detalle;
    private String caracateristica;

    public Sospechoso() {
    }

    //todos los sospechosos tienen como nombre "sospechoso" + ID
    //todos los sospechosos son INOCENTES hasta que se demuestren lo contrario
    public Sospechoso(Integer id, String detalle, String caracateristica) {
        this.id = id;
        this.nombre = "sospechoso" + id;
        this.culpable = false;
        this.detalle = detalle;
        this.caracateristica = caracateristica;
    }

    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id;}

    public String getNombre() { return nombre;}

    //es un dato que no se ingresará manualmente ya que se setea automáticamente, por lo tanto el setter no es necesario
//    public void setNombre(String nombre) {  this.nombre = nombre; }

    public boolean isCulpable() {  return culpable; }

    public void setCulpable(boolean culpable) { this.culpable = culpable;}

    public String getDetalle() { return detalle;}

    public void setDetalle(String detalle) {this.detalle = detalle;}

    public String getCaracateristica() {return caracateristica;}

    public void setCaracateristica(String caracateristica) { this.caracateristica = caracateristica;}
    
    

    @Override
    public String toString() {
        return "Sospechoso{" + "id=" + id + ", nombre=" + nombre + ", culpable=" + culpable + ", detalle=" + detalle + ", caracateristica=" + caracateristica + '}';
    }
    
    
}
