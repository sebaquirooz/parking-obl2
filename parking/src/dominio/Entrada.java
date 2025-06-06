package dominio;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrada extends Movimiento {

    private Salida salida;

    public Entrada(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechayHora, String nota) {
        super(vehiculo, empleado, fechayHora, nota);
        this.salida = null;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return this.getVehiculo().getMatricula() + " " + this.getFechaYhora().format(DateTimeFormatter.ISO_DATE);
    }

}
