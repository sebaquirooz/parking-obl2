package dominio;
import java.util.Date;
import java.time.LocalDateTime;
        
public class Salida extends Movimiento {

    private int tiempoTotal;
    
    private Entrada entrada;

    public Salida(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechayHora, String nota, int tiempoTotal, Entrada entrada) {
        super(vehiculo, empleado, fechayHora, nota);
        this.tiempoTotal = tiempoTotal;
        this.entrada = entrada;
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
    

}
