package dominio;

import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Movimiento {

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
    
}
