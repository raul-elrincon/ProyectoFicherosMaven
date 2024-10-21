package com.ejemplo.proyectoaccesoadatos1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlEmpleadoManager {

    private static final String XML_FILE = "empleados.xml";

    // Exportar lista de empleados a XML
    public static void exportarEmpleadosXML(List<Empleado> empleados) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(EmpleadoListaWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        EmpleadoListaWrapper wrapper = new EmpleadoListaWrapper();
        wrapper.setEmpleados(empleados);

        try (FileWriter fileWriter = new FileWriter(XML_FILE)) {
            marshaller.marshal(wrapper, fileWriter);
        }

        System.out.println("Empleados exportados a XML.");
    }

    // Importar lista de empleados desde XML
    public static List<Empleado> importarEmpleadosXML() throws JAXBException, IOException {
        File file = new File(XML_FILE);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        JAXBContext context = JAXBContext.newInstance(EmpleadoListaWrapper.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        EmpleadoListaWrapper wrapper = (EmpleadoListaWrapper) unmarshaller.unmarshal(file);
        return wrapper.getEmpleados();
    }

    // Crear (agregar un empleado y actualizar XML)
    public static void agregarEmpleado(Empleado empleado, List<Empleado> empleados) throws JAXBException, IOException {
        empleados.add(empleado);
        exportarEmpleadosXML(empleados);
        System.out.println("Empleado añadido y archivo XML actualizado.");
    }

    // Eliminar un empleado y actualizar XML
    public static void eliminarEmpleado(Empleado empleado, List<Empleado> empleados) throws JAXBException, IOException {
        empleados.remove(empleado);
        exportarEmpleadosXML(empleados);
        System.out.println("Empleado eliminado y archivo XML actualizado.");
    }

    // Actualizar un empleado existente
    public static void actualizarEmpleado(Empleado empleado, List<Empleado> empleados) throws JAXBException, IOException {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(empleado.getNombre())) {
                empleados.set(i, empleado);
                exportarEmpleadosXML(empleados);
                System.out.println("Empleado actualizado en el archivo XML.");
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }
}
