package com.ejemplo.mavenproject2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Leer {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\empleados.dat");  ObjectInputStream ois = new ObjectInputStream(fis)) {
            Empleado emp = (Empleado) ois.readObject();
            System.out.println("Objeto leído del fichero: " + emp.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
