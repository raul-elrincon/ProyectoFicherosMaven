package com.ejemplo.maventaskade;

import com.google.gson.Gson;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class MavenTaskADE {

    public static void main(String[] args) throws IOException, PropertyException, JAXBException {
        System.out.println("Hello World!");
        Empleado e1 = new Empleado("Edu", "Lopez", "Hernandez", "Fontanero", 999, 27);
        Empleado e2 = new Empleado("Cristian", "Marrero", "Marrero", "Ingeniero", 1529, 28);
        Empleado e3 = new Empleado("David", "Trujillo", "Hernandez", "Piloto", 1250, 26);
        Empleado e4 = new Empleado("Raul", "Jimenez", "Jimenez", "Desarrollador", 1800, 26);

        System.out.println(e1);

        // Crear una lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        // Convertir la lista de empleados a JSON
        Gson gson = new Gson();
        String json = gson.toJson(empleados);
        System.out.println("Lista de empleados en formato JSON:");
        System.out.println(json);
        
        FileWriter ficheroTexto = new FileWriter("yeison.json");
        ficheroTexto.write(json);
        ficheroTexto.close();
        
        // Convertir el objeto Empleado a CSV
        try (CSVWriter writer = new CSVWriter(new FileWriter("empleado.csv"))) {
            String[] header = { "Nombre", "Apellido1", "Apellido2", "Trabajo", "Salario", "Edad" };
            writer.writeNext(header);
            String[] data = { e1.getNombre(), e1.getPrimerApellido(), e1.getSegundoApellido(), e1.getPuestoDeTrabajo(), 
                              String.valueOf(e1.getSueldo()), String.valueOf(e1.getEdad()) };
            writer.writeNext(data);
        }
        System.out.println("Empleado exportado a CSV.");
        
        // Convertir el objeto Empleado a XML
        JAXBContext context = JAXBContext.newInstance(Empleado.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Guardar en archivo XML
        marshaller.marshal(e1, new File("empleado.xml"));
        System.out.println("Empleado exportado a XML.");
        
        
    }
}
