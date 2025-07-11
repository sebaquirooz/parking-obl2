//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Servicio extends Movimiento implements Serializable {

	private String tipo;
        
	private int costo;
        
        
    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Servicio(Vehiculo unVehiculo,Empleado unEmpleado, String unServicio,LocalDateTime fechayHora, int unCosto){
        super(unVehiculo, unEmpleado, fechayHora);
        this.costo = unCosto;
        this.tipo = unServicio;
    }

  
     @Override
    public String toString() {
        return this.getTipo() +" | " +this.getVehiculo().getMatricula() +" | "+ this.getFechaYhora().format(formatoMovimientos);
    }
}
