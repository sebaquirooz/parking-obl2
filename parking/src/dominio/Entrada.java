package dominio;

import java.util.Date;

public class Entrada {

	private Vehiculo vehiculo;
        
        private Empleado empleado;

	private Date fecha;
        
        private String hora;

	private String nota;

    public Entrada(Vehiculo vehiculo, Empleado empleado, Date fecha, String hora, String nota) {
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.nota = nota;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
	
}
