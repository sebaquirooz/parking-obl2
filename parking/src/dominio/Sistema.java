package dominio;

import java.util.ArrayList;

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

    public ArrayList<Vehiculo> getListaVehiculo() {
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
}
