package com.ejemplo.proyectoaccesoadatos1;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "empleados")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmpleadoListaWrapper {

    private List<Empleado> empleados;

    @XmlElement(name = "empleado")
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
