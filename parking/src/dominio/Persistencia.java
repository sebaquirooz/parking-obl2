package dominio;

import java.io.*;
import java.nio.file.*;

public class Persistencia {

    public static void guardarSistema(Sistema unSistema) {
        try (
            ObjectOutputStream out = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("DATOS.ser")))) {
            out.writeObject(unSistema);
            System.out.println("Sistema guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el sistema.");

        }
    }

    public static Sistema cargarSistema() {
        Sistema unSistema = null;
        try {
            ObjectInputStream in = new ObjectInputStream(
                    Files.newInputStream(Paths.get("DATOS.ser")));
            unSistema = (Sistema) in.readObject();
            System.out.println("Sistema cargado.");
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error de recuperación");
            e.printStackTrace();
        }
        return unSistema;
    
    }
}
