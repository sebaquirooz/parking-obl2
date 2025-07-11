//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;

import java.io.Serializable;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Movimiento implements Serializable {

    private Vehiculo vehiculo;

    private Empleado empleado;

    private LocalDateTime fechaYhora;


    public Movimiento(Vehiculo vehiculo, Empleado empleado,LocalDateTime fechayHora) {
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.fechaYhora = fechayHora;
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

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }
    
    protected static final DateTimeFormatter formatoMovimientos = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //protected para que las subclases puedan acceder y final para valor constante

    
}
