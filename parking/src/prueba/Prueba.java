package prueba;
import dominio.*;
import interfaz.*;

public class Prueba {
    public static void main(String[] args) {
        Sistema unSistema = new Sistema();
        Menu elMenu = new Menu(unSistema);
        elMenu.setVisible(true);
    }
}
