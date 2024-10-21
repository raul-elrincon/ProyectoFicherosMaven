//exportar a CSV
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try (CSVWriter writer = new CSVWriter(new FileWriter("empleado.csv"))) {
            String[] header = {"Nombre", "Apellido1", "Apellido2", "Trabajo", "Salario", "Edad"};
            writer.writeNext(header);
            for (Empleado e : empleados) {
                String[] data = {e.getNombre(), e.getPrimerApellido(), e.getSegundoApellido(), e.getPuestoDeTrabajo(),
                    String.valueOf(e.getSueldo()), String.valueOf(e.getEdad())};
                writer.writeNext(data);
            }

        } catch (IOException ex) {
            System.out.println("Me jodieron");
        }
        System.out.println("Empleado exportado a CSV.");
    }                                        

    //importar un CSV
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Limpiar la lista actual de empleados
        empleados.clear();

        try (
                CSVReader reader = new CSVReader(new FileReader("empleado.csv"))) {

            String[] nextLine;
            boolean isFirstLine = true; // Para saltarse la cabecera

            // Leer cada línea del archivo CSV
            while ((nextLine = reader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Saltar la cabecera
                    continue;
                }
                // Crear un nuevo empleado con los datos de la línea
                String nombre = nextLine[0];
                String apellido1 = nextLine[1];
                String apellido2 = nextLine[2];
                String trabajo = nextLine[3];
                int salario = Integer.parseInt(nextLine[4]);
                int edad = Integer.parseInt(nextLine[5]);

                Empleado empleado = new Empleado(nombre, apellido1, apellido2, trabajo, salario, edad);
                empleados.add(empleado);
            }

            for (Empleado e : empleados) {
                System.out.println(e.getNombre());

            }

        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al importar el archivo CSV.");
        } catch (CsvValidationException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

