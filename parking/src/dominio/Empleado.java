package dominio;

public class Empleado extends Persona{

	private int numeroEmpleado;

    public Empleado(String nombre, String cedula, String direccion, int numeroEmpleado) {
        super(nombre, cedula, direccion);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
        @Override
    public String toString() {
        return this.getNombre() + " " + this.numeroEmpleado;
    }
}
