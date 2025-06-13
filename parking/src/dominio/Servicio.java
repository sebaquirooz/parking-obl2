package dominio;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Servicio extends Movimiento {

	private String tipo;
        
	private Vehiculo vehiculo;

	private Empleado empleado;

	private int costo;
        
        private LocalDateTime fechaYHora;
        
    public String getTipo() {
        return tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public int getCosto() {
        return costo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Servicio(Vehiculo unVehiculo,Empleado unEmpleado, String unServicio,LocalDateTime fechayHora, int unCosto){
        super(unVehiculo, unEmpleado, fechayHora);
        this.costo = unCosto;
        this.tipo = unServicio;
    }

  
    public String toString(){
        return this.getTipo()+ " " + this.getVehiculo();
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
        
}
