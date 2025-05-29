package dominio;

import java.util.Date;

public class Salida extends Movimiento {

    private int tiempoTotal;
    
    private Entrada entrada;

    public Salida(Vehiculo vehiculo, Empleado empleado, Date fecha, String hora, String nota, int tiempoTotal, Entrada entrada) {
        super(vehiculo, empleado, fecha, hora, nota);
        this.tiempoTotal = tiempoTotal;
        this.entrada = entrada;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    
    public String calcularTiempoTotal(){
        int horas = this.tiempoTotal/60;
        int minutos = this.tiempoTotal% 60;
        String retorno = horas +"h";
        if (minutos > 0){
            retorno+= " - " +minutos +" min";
        }
        return retorno;
    }
    

}
