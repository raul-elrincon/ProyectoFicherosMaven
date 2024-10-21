package com.ejemplo.proyectoaccesoadatos1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "empleado")
@XmlAccessorType(XmlAccessType.FIELD)
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;  // Esto asegura la compatibilidad de la clase durante la deserialización.
    public String Nombre;
    public String PrimerApellido;
    public String SegundoApellido;
    public String PuestoDeTrabajo;
    private int Sueldo;
    private int Edad;

    public Empleado() {
    }  // Constructor sin nada lo pide JAXB

    public Empleado(String Nombre, String PrimerApellido, String SegundoApellido, String PuestoDeTrabajo, int Sueldo, int Edad) {
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.PuestoDeTrabajo = PuestoDeTrabajo;
        this.Sueldo = Sueldo;
        this.Edad = Edad;
    }

    @XmlElement
    public String getNombre() {
        return Nombre;
    }

    @XmlElement
    public String getPrimerApellido() {
        return PrimerApellido;
    }

    @XmlElement
    public String getSegundoApellido() {
        return SegundoApellido;
    }

    @XmlElement
    public String getPuestoDeTrabajo() {
        return PuestoDeTrabajo;
    }

    @XmlElement
    public int getSueldo() {
        return Sueldo;
    }

    @XmlElement
    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", PrimerApellido=" + PrimerApellido + ", SegundoApellido=" + SegundoApellido
                + ", PuestoDeTrabajo=" + PuestoDeTrabajo + ", Sueldo=" + Sueldo + ", Edad=" + Edad + '}';
    }
}
