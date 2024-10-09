package com.ejemplo.maventaskade;

public class Empleado {

    public String Nombre;
    public String PrimerApellido;
    public String SegundoApellido;
    private String PuestoDeTrabajo;
    private int Sueldo;
    private int Edad;

    public Empleado(String Nombre, String PrimerApellido, String SegundoApellido, String PuestoDeTrabajo, int Sueldo, int Edad) {
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.PuestoDeTrabajo = PuestoDeTrabajo;
        this.Sueldo = Sueldo;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public String getPuestoDeTrabajo() {
        return PuestoDeTrabajo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", PrimerApellido=" + PrimerApellido + ", SegundoApellido=" + SegundoApellido + ", PuestoDeTrabajo=" + PuestoDeTrabajo + ", Sueldo=" + Sueldo + ", Edad=" + Edad + '}';
    }

}
