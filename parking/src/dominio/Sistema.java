package dominio;
import java.util.*;

public class Sistema {

	private ArrayList<Cliente> listaClientes;

	private ArrayList<Empleado> listaEmpleados;

	private ArrayList<Persona> listaPersonas;

	private ArrayList<Vehiculo> listaVehiculos;

	private ArrayList<Contrato> listaContratos;

    
        
    public Sistema(){
        this.listaEmpleados = new ArrayList<>();
        this.listaClientes =  new ArrayList<>();
        this.listaPersonas =  new ArrayList<>();
        this.listaVehiculos =  new ArrayList<>();
        this.listaContratos =  new ArrayList<>();  
    }    
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        this.listaVehiculos = listaVehiculo;
    }

    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public void setListaContratos(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }
    
    public boolean verificarEmpleado (String cedula){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            if (this.listaEmpleados.get(i).getCedula().equals(cedula)){
                return false;
            }
        }
        return true;
    }
    
    public void registrarEmpleado(String nombre, String cedula, String direccion, int numeroEmpleado){
        if(verificarEmpleado(cedula)){
            Empleado empleadoNuevo = new Empleado(nombre, cedula, direccion, numeroEmpleado);
            this.listaEmpleados.add(empleadoNuevo);
        }
    }
    
    public boolean verificarVehiculo (String matricula){
        for (int i = 0; i < this.listaVehiculos.size(); i++){
            if (this.listaVehiculos.get(i).getMatricula().equals(matricula)){
                return false;
            }
        }
        return true;
    }
    
    public void registrarVehiculo (String matricula, String marca, String modelo, String nota){
        if (this.verificarVehiculo(matricula)){
            Historial historialNuevo = new Historial();
            Vehiculo vehiculoNuevo = new Vehiculo (matricula, marca, modelo, nota, historialNuevo);
            this.listaVehiculos.add(vehiculoNuevo);
        }
    }
    

    public boolean verificarCliente (String cedula){
        for (int i = 0; i < this.listaClientes.size(); i++){
            if (this.listaClientes.get(i).getCedula().equals(cedula)){
                return false;
            }
        }
        return true;
    }
    
    public void registrarCliente (String nombre, String cedula, String direccion, int celular, int añoIngreso){
        if (this.verificarCliente(cedula)){
            Cliente clienteNuevo = new Cliente (nombre, cedula, direccion, celular, añoIngreso);
            this.listaClientes.add(clienteNuevo);
        }
    }
    
    public void registrarEntrada (Vehiculo vehiculo, Empleado empleado, Date fecha, String hora, String nota){
        vehiculo.setEstacionado(true);
        Entrada entradaNueva = new Entrada (vehiculo, empleado, fecha, hora, nota);
        vehiculo.getHistorial().getListaEntradas().add(entradaNueva);
    }
    
    public Empleado[] obtenerListaEmpleados(){
        return this.getListaEmpleados().toArray(new Empleado[this.getListaEmpleados().size()]);
    }
    
    public Vehiculo[] obtenerListaVehiculosNoEstacionados() {
        ArrayList<Vehiculo> noEstacionados = new ArrayList<>();
        for (Vehiculo v: this.getListaVehiculos()){
            if (!v.isEstacionado()){
                noEstacionados.add(v);
            }
        }
        return noEstacionados.toArray(new Vehiculo[this.getListaVehiculos().size()]);
    }
}
