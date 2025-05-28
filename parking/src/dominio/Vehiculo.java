package dominio;

public class Vehiculo {

	private String matricula;

	private String marca;

	private String modelo;

	private String estado;
        
        private Contrato contrato;

	private boolean estacionado;

	private Historial historial;

    public Vehiculo(String matricula, String marca, String modelo, String estado, Historial historial) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.contrato = null;
        this.estacionado = false;
        this.historial = historial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
    
    public String toString(){
        return this.marca + " " + this.matricula;
    }

}
