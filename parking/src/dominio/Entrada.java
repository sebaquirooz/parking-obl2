package dominio;

import java.util.Date;

public class Entrada extends Movimiento {

    private Salida salida;

    public Entrada(Vehiculo vehiculo, Empleado empleado, Date fecha, String hora, String nota) {
        super(vehiculo, empleado, fecha, hora, nota);
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
        return this.getVehiculo().getMatricula() + " " + this.getFecha() + " " + this.getHora();
    }

}
