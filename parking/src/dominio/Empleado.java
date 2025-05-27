package dominio;

public class Empleado extends Persona{

	private int numeroEmpleado;

    public Empleado(String nombre, String cedula, String direccion, int numeroEmpleado) {
        super(nombre, cedula, direccion);
        this.numeroEmpleado = numeroEmpleado;
    }

}
