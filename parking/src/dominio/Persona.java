//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;

public class Persona {

	private String nombre;

	private String cedula;

	private String direccion;

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        @Override
    public String toString(){
        return this.nombre;
    }

}
