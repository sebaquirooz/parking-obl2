//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable{

	private String numeroEmpleado;

    public Empleado(String nombre, String cedula, String direccion, String numeroEmpleado) {
        super(nombre, cedula, direccion);
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
        @Override
    public String toString() {
        return this.getNombre() + " " + this.numeroEmpleado;
    }
}
