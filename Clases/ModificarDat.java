package com.ejemplo.mavenproject2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Modificar {
    private static final String fic = "C:\\empleados.dat";

    public static void main(String[] args) {
        File archivo = new File(fic);
        File archivotemp = new File(fic + "_tmp");
        boolean encontrado = false;

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(archivotemp));
             ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo))) {
             
            String nombreActual = "Juan";
            String nuevoNombre = "Alberto";
            
            while (true) {
                Empleado empLeido = (Empleado) leer.readObject();
                if (empLeido.getNombre().equals(nombreActual)) {
                    empLeido.setNombre(nuevoNombre);
                    encontrado = true;
                }
                escribir.writeObject(empLeido);
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
            System.out.println("Error al leer el archivo. " + e.getMessage());
        }
        archivo.delete();
        archivotemp.renameTo(archivo);
    }
}
