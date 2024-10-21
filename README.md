## Gestión de Empleados - Aplicación de Escritorio
Esta aplicación permite gestionar una lista de empleados mediante una interfaz gráfica de usuario (GUI) desarrollada en Java Swing.
Los empleados pueden ser agregados, modificados, eliminados, e importados o exportados en varios formatos, como JSON, CSV, XML, y DAT.

### Funcionalidades
1. Gestión de Empleados (CRUD).

Añadir empleado o importar: Permite agregar empleados a la lista introduciendo sus datos (nombre, apellidos, puesto de trabajo, sueldo, edad).

Modificar empleados: Puedes modificar la información de un empleado existente.

Eliminar empleados: Elimina empleados de la lista seleccionada.

3. Importación de Empleados
La aplicación permite importar empleados desde archivos en diferentes formatos:

JSON: Importa un archivo JSON que contiene empleados en formato de objetos serializados.

CSV: Importa empleados desde un archivo CSV que debe tener una cabecera con los campos: nombre, primer apellido, segundo apellido, puesto de trabajo, sueldo, edad.

XML: Utilizando JAXB, puedes importar empleados desde un archivo XML con una estructura previamente definida.

DAT: Importa empleados serializados en archivos .dat, utilizando deserialización de objetos Java.

3. Exportación de Empleados
Puedes exportar la lista de empleados en diferentes formatos:

JSON: Utiliza GSON para serializar los empleados a un archivo JSON.
CSV: Exporta los empleados a un archivo CSV con los campos mencionados anteriormente con OpenCSV.
XML: Utilizando JAXB, exporta los empleados a un archivo XML.
DAT: Serializa los empleados a un archivo .dat que puede ser leído posteriormente.

### Agradecimientos
- **Cristian Marrero Marrero**
- **David Tejera Gonzalez**
- **Eduardo López Hernández**
- **Raul Jimenez Delgado**
