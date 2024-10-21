package com.ejemplo.mavenproject2;
import java.io.*;

public class Eliminar {

    private static final String fic = "C:\\empleados.dat";

    public static void main(String[] args) {
        File archivo = new File(fic);
        File archivotemp = new File(fic+"_tmp");
        boolean encontrado = false;
        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(archivotemp));   ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo))) {
            String nombre = "Juan";
            while (true) {
                Empleado empLeido = (Empleado) leer.readObject();
                if (empLeido.getNombre().equals(nombre)) {
                    System.out.println("Usuario eliminado");
                    encontrado = true;
                } else {
                    escribir.writeObject(empLeido);
                }
            }
        } catch (EOFException eof) {
            if (!encontrado) {
                System.out.println("El empleado no existe.");
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Archivo no encontrado " + fnf.toString());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo. "+ e.getMessage());
        }
        archivo.delete();
        archivotemp.renameTo(archivo);
    }
}
