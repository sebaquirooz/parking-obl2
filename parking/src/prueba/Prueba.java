//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
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

