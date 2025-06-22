//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrada extends Movimiento implements Serializable {

    private Salida salida;
    
    private String nota;
    
    public Entrada(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechayHora, String nota) {
        super(vehiculo, empleado, fechayHora);
        this.nota = nota;
        this.salida = null;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return this.getVehiculo().getMatricula() + " | " + this.getFechaYhora().format(formatoMovimientos);
    }

}
