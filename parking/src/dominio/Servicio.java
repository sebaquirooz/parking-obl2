package dominio;

import java.util.Date;

public class Servicio {

	private String tipo;

	private Date fecha;
        
	private Vehiculo vehiculo;

	private Empleado empleado;

	private int costo;
        
        private String hora;

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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public Servicio(Vehiculo unVehiculo,Empleado unEmpleado, String unServicio,Date unaFecha,String unaHora, int unCosto){
        this.vehiculo = unVehiculo;
        this.costo = unCosto;
        this.empleado = unEmpleado;
        this.tipo = unServicio;
        this.fecha = unaFecha;
        this.hora = unaHora;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    public String toString(){
        return this.getTipo() + this.getVehiculo() + this.getFecha();
    }
        
}
