package com.ejemplo.mavenproject2;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Escribir {
    public static void main(String[] args) {
        List<Empleado> listaEmp = crearListaEmp();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\empleados.dat"))) {
            for(Empleado emp : listaEmp) {
                oos.writeObject(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static List<Empleado> crearListaEmp() {
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("Juan", "Perez", 30,"puesto",20+"€"));
        return lista;
    }
}
