//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;
import java.util.Date;
import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
        
        private String celular;
        
	private int añoIngreso;
    
    public Cliente(String nombre, String cedula, String direccion, String celular, int añoIngreso) {
        super(nombre, cedula, direccion);
        this.celular = celular;
        this.añoIngreso = añoIngreso;
    }   

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getCelular() {
        return celular;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

}
