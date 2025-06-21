//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;
import java.util.Date;
import java.time.LocalDateTime;
        
public class Salida extends Movimiento {

    private int tiempoTotal;
    
    private Entrada entrada;
    
    private String nota;

    public Salida(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechayHora, String nota, int tiempoTotal, Entrada entrada) {
        super(vehiculo, empleado, fechayHora);
        this.tiempoTotal = tiempoTotal;
        this.entrada = entrada;
        this.nota = nota;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
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
