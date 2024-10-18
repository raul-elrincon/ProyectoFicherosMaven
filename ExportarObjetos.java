if (jComboBox1.getSelectedItem() == "Exportar a objetos") {
	EmpleadoListaWrapper wrapper = new EmpleadoListaWrapper();
	wrapper.getEmpleados();
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NombreFichero+".dat"))) {
		oos.writeObject(wrapper);
	} catch (IOException ex) {
		Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
		System.out.println("Error al exportar en formato de objetos");
	}
	System.out.println("Empleados exportados a fichero de objetos");
	}