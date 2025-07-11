//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package dominio;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable {

    private ArrayList<Cliente> listaClientes;

    private ArrayList<Empleado> listaEmpleados;

    private ArrayList<Persona> listaPersonas;

    private ArrayList<Vehiculo> listaVehiculos;

    private ArrayList<Contrato> listaContratos;

    private ArrayList<Movimiento> listaMovimientos;

    private ArrayList<Servicio> listaServicios;

    private ArrayList<Entrada> listaEntradas;

    private ArrayList<Salida> listaSalidas;

    private int contadorContratos;

    private boolean modoOscuro = false;

    public Sistema() {
        this.listaEmpleados = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaContratos = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
        this.listaSalidas = new ArrayList<>();
        this.listaEntradas = new ArrayList<>();
        this.contadorContratos = 0;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public ArrayList<Salida> getListaSalidas() {
        return listaSalidas;
    }

    public void setListaSalidas(ArrayList<Salida> listaSalidas) {
        this.listaSalidas = listaSalidas;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
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

    public int getContadorContratos() {
        return contadorContratos;
    }

    public void setContadorContratos(int contadorContratos) {
        this.contadorContratos = contadorContratos;
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

    public void registrarEmpleado(String nombre, String cedula, String direccion, String numeroEmpleado) {
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

    public void registrarContrato(Cliente unCliente, Vehiculo unVehiculo, Empleado unEmpleado, String unValor) {
        this.contadorContratos++;
        Contrato contratoNuevo = new Contrato(unCliente, unVehiculo, unEmpleado, unValor, contadorContratos);
        this.listaContratos.add(contratoNuevo);
        unVehiculo.setContrato(contratoNuevo);
        setChanged();
        notifyObservers();
    }

    public void registrarServicio(Vehiculo unVehiculo, Empleado unEmpleado, String unServicio, LocalDateTime unaFechayUnaHora, int unCosto) {
        Servicio servicioNuevo = new Servicio(unVehiculo, unEmpleado, unServicio, unaFechayUnaHora, unCosto);
        this.listaServicios.add(servicioNuevo);
        this.listaMovimientos.add(servicioNuevo);
        unVehiculo.getHistorial().getListaServicios().add(servicioNuevo);
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

    public void registrarCliente(String nombre, String cedula, String direccion, String celular, int añoIngreso) {
        if (this.verificarCliente(cedula)) {
            Cliente clienteNuevo = new Cliente(nombre, cedula, direccion, celular, añoIngreso);
            this.listaClientes.add(clienteNuevo);
            setChanged();
            notifyObservers();
        }
    }

    public void registrarEntrada(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechayHora, String nota) {
        vehiculo.setEstacionado(true);
        Entrada entradaNueva = new Entrada(vehiculo, empleado, fechayHora, nota);
        vehiculo.getHistorial().getListaEntradas().add(entradaNueva);
        this.getListaMovimientos().add(entradaNueva);
        this.getListaEntradas().add(entradaNueva);
        setChanged();
        notifyObservers();
    }

    public void registrarSalida(Entrada unaEntrada, Empleado unEmpleado, LocalDateTime fechayHora, String notaDeSalida) {
        unaEntrada.getVehiculo().setEstacionado(false); //Aca entrada solo tiene null en salida, hay que agarrar el super.
        int tiempoTotal = (int) ChronoUnit.MINUTES.between(unaEntrada.getFechaYhora(), fechayHora);
        Salida unaSalida = new Salida(unaEntrada.getVehiculo(), unEmpleado, fechayHora, notaDeSalida, tiempoTotal, unaEntrada);
        unaEntrada.getVehiculo().getHistorial().getListaSalidas().add(unaSalida);
        this.getListaMovimientos().add(unaSalida);
        this.getListaSalidas().add(unaSalida);
        unaEntrada.setSalida(unaSalida);
        setChanged();
        notifyObservers();
    }

    public Servicio[] obtenerListaServicios() {
        return this.getListaServicios().toArray(new Servicio[this.getListaServicios().size()]);
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
        return noEstacionados.toArray(new Vehiculo[noEstacionados.size()]);
    }

    public Vehiculo[] obtenerVehiculoEstacionados() {
        ArrayList<Vehiculo> vehiculosEstacionados = new ArrayList<>();
        for (int i = 0; i < this.getListaVehiculos().size(); i++) {
            if (this.getListaVehiculos().get(i).isEstacionado()) {
                vehiculosEstacionados.add(this.getListaVehiculos().get(i));
            }
        }
        return vehiculosEstacionados.toArray(new Vehiculo[vehiculosEstacionados.size()]);
    }

    public void eliminarCliente(Cliente unCliente) {
        this.listaClientes.remove(unCliente);
        for (int i = 0; i < this.getListaContratos().size(); i++) {
            if (this.getListaContratos().get(i).getCliente().equals(unCliente)) {
                this.getListaContratos().remove(i);
            }
        }
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
                if (entrada.getSalida() == null) {
                    entradasActivas.add(entrada);
                }
            }
        }
        return entradasActivas.toArray(new Entrada[entradasActivas.size()]);
    }

    public boolean verificarHora(String hora) { //Función de ChatGPT.
        if (hora == null || hora.length() != 5 || hora.charAt(2) != ':') {
            return false;
        }

        // Extraemos subcadenas de horas y minutos
        String horaStr = hora.substring(0, 2);
        String minStr = hora.substring(3, 5);

        try {
            int hh = Integer.parseInt(horaStr);
            int mm = Integer.parseInt(minStr);

            return (hh >= 0 && hh <= 23) && (mm >= 0 && mm <= 59);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String calcularTiempoTotal(Salida unaSalida) {
        int horas = unaSalida.getTiempoTotal() / 60;
        int minutos = unaSalida.getTiempoTotal() % 60;
        String retorno = horas + " h";
        if (minutos > 0) {
            retorno += " - " + minutos + " min";
        }
        return retorno;
    }

}
