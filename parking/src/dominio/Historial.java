package dominio;

import java.util.ArrayList;

public class Historial {

	private ArrayList<Entrada> listaEntradas;

	private ArrayList<Salida> listaSalidas;

	private ArrayList<Servicio> listaServicios;

    public Historial() {
        this.listaEntradas = new ArrayList<>();
        this.listaSalidas = new ArrayList<>();
        this.listaServicios =  new ArrayList<>();
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

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

}
