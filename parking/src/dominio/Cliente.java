package dominio;
import java.util.Date;

public class Cliente extends Persona{
        
        private int celular;
        
	private int añoIngreso;
    
    public Cliente(String nombre, String cedula, String direccion, int celular, int añoIngreso) {
        super(nombre, cedula, direccion);
        this.celular = celular;
        this.añoIngreso = añoIngreso;
    }   

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public int getCelular() {
        return celular;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

}
