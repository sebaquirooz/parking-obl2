package dominio;

import java.util.*;
import java.time.temporal.ChronoUnit;

public class Sistema extends Observable {

    private ArrayList<Cliente> listaClientes;

    private ArrayList<Empleado> listaEmpleados;

    private ArrayList<Persona> listaPersonas;

    private ArrayList<Vehiculo> listaVehiculos;

    private ArrayList<Contrato> listaContratos;

    private ArrayList<Movimiento> listaMovimientos;

    public Sistema() {
        this.listaEmpleados = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaContratos = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
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

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    public boolean verificarEmpleado(String cedula) {
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            if (this.listaEmpleados.get(i).getCedula().equals(cedula)) {
                return false;
            }
        }
        return true;
    }

    public void registrarEmpleado(String nombre, String cedula, String direccion, int numeroEmpleado) {
        if (verificarEmpleado(cedula)) {
            Empleado empleadoNuevo = new Empleado(nombre, cedula, direccion, numeroEmpleado);
            this.listaEmpleados.add(empleadoNuevo);
            setChanged();
            notifyObservers();
        }
    }

    public boolean verificarVehiculo(String matricula) {
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (this.listaVehiculos.get(i).getMatricula().equals(matricula)) {
                return false;
            }
        }
        return true;
    }

    public void registrarVehiculo(String matricula, String marca, String modelo, String nota) {
        if (this.verificarVehiculo(matricula)) {
            Historial historialNuevo = new Historial();
            Vehiculo vehiculoNuevo = new Vehiculo(matricula, marca, modelo, nota, historialNuevo);
            this.listaVehiculos.add(vehiculoNuevo);
            setChanged();
            notifyObservers();
        }
    }

    public void registrarContrato(Cliente unCliente, Vehiculo unVehiculo, Empleado unEmpleado, int unValor) {
        Contrato contratoNuevo = new Contrato(unCliente, unVehiculo, unEmpleado, unValor);
        this.listaContratos.add(contratoNuevo);
        setChanged();
        notifyObservers();
    }

    public boolean verificarCliente(String cedula) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getCedula().equals(cedula)) {
                return false;
            }
        }
        return true;
    }

    public void registrarCliente(String nombre, String cedula, String direccion, int celular, int añoIngreso) {
        if (this.verificarCliente(cedula)) {
            Cliente clienteNuevo = new Cliente(nombre, cedula, direccion, celular, añoIngreso);
            this.listaClientes.add(clienteNuevo);
            setChanged();
            notifyObservers();
        }
    }

    public void registrarEntrada(Vehiculo vehiculo, Empleado empleado, Date fecha, String hora, String nota) {
        vehiculo.setEstacionado(true);
        Entrada entradaNueva = new Entrada(vehiculo, empleado, fecha, hora, nota);
        vehiculo.getHistorial().getListaEntradas().add(entradaNueva);
        this.getListaMovimientos().add(entradaNueva);
    }

    public Vehiculo[] obtenerListaVehiculos() {

        return this.getListaVehiculos().toArray(new Vehiculo[this.getListaVehiculos().size()]);
    }

    public Cliente[] obtenerListaClientes() {
        return this.getListaClientes().toArray(new Cliente[this.getListaClientes().size()]);
    }

    public Empleado[] obtenerListaEmpleados() {
        return this.getListaEmpleados().toArray(new Empleado[this.getListaEmpleados().size()]);
    }

    public Vehiculo[] obtenerListaVehiculosNoEstacionado() {
        ArrayList<Vehiculo> noEstacionados = new ArrayList<>();
        for (Vehiculo v : this.getListaVehiculos()) {
            if (!v.isEstacionado()) {
                noEstacionados.add(v);
            }
        }
        return noEstacionados.toArray(new Vehiculo[this.getListaVehiculos().size()]);
    }

    public void eliminarCliente(Cliente unCliente) {
        this.listaClientes.remove(unCliente);
        setChanged();
        notifyObservers();
    }

    public Contrato[] obtenerListaContratos() {
        return this.getListaContratos().toArray(new Contrato[this.getListaContratos().size()]);
    }

    public Entrada[] obtenerListaEntradas() {
        ArrayList<Entrada> entradasActivas = new ArrayList<>();
        for (Movimiento m : this.getListaMovimientos()) {
            if (m instanceof Entrada) { //Verifico si el movimiento es una Entrada
                Entrada entrada = (Entrada) m;
                if (entrada.getSalida() == null){
                    entradasActivas.add(entrada);
                }
            }
        }
        return entradasActivas.toArray(new Entrada[entradasActivas.size()]);
    }
    
    public Salida registrarSalida(Entrada entrada, Empleado empleado, Date fecha, String hora, String nota){
        long dias = fecha - entrada.getFecha();
        int tiempoTotal = fecha - entrada.getFecha();
        
        Salida salidaNueva = new Salida(entrada.getVehiculo(), empleado, fecha, hora, nota, tiempoTotal, entrada);
        
    }
}
