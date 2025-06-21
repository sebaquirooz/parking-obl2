//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;

public class Contrato {

	private int numeroContrato;

	private Cliente cliente;

	private Vehiculo vehiculo;

	private Empleado empleado;

	private String valor;

    public Contrato(Cliente unCliente, Vehiculo unVehiculo, Empleado unEmpleado, String unValor, int numeroContrato){
        this.cliente = unCliente;
        this.empleado = unEmpleado;
        this.vehiculo = unVehiculo;
        this.valor = unValor;
        this.numeroContrato = numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public String getValor() {
        return valor;
    }

    public String toString(){
        return this.cliente.toString();
    }

}
