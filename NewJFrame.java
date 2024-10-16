package com.ejemplo.maventaskade;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

    private List<Empleado> empleados;

    public NewJFrame(List<Empleado> empleados) {

        initComponents();
        this.empleados = empleados;

        // Crear un DefaultListModel para almacenar los empleados
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Llenar el modelo con los empleados cargados
        for (Empleado e : empleados) {
            listModel.addElement(e.getNombre() + " " + e.getPrimerApellido() + " " + e.getSegundoApellido() + " | " + e.getPuestoDeTrabajo());
        }

        // Asignar el modelo a jList1
        jList1.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("LISTA DE DEGENERADOS");

        jTextField1.setText("Nombre");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField2.setText("1er Apellido");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jTextField3.setText("2o Apellido");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jTextField4.setText("Puesto de trabajo");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.setText("Edad");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jTextField6.setText("Salario");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jButton1.setText("Añadir empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Importar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exportar a java", "Exportar a json", "Exportar a csv", "Exportar a xml" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equals("Nombre")) {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Nombre");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if (jTextField2.getText().equals("1er Apellido")) {
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("1er Apellido");
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if (jTextField3.getText().equals("2o Apellido")) {
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("2o Apellido");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if (jTextField4.getText().equals("Puesto de trabajo")) {
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("Puesto de trabajo");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        if (jTextField5.getText().equals("Edad")) {
            jTextField5.setText("");
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if (jTextField5.getText().equals("")) {
            jTextField5.setText("Edad");
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        if (jTextField6.getText().equals("Salario")) {
            jTextField6.setText("");
        }
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if (jTextField6.getText().equals("")) {
            jTextField6.setText("Salario");
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = jTextField1.getText();
        String Apellido1 = jTextField2.getText();
        String Apellido2 = jTextField3.getText();
        String Puesto = jTextField4.getText();
        int Edad = Integer.parseInt(jTextField5.getText());
        int Salario = Integer.parseInt(jTextField6.getText());

        // Crear un nuevo empleado y añadirlo a la lista
        Empleado nuevoEmpleado = new Empleado(nombre, Apellido1, Apellido2, Puesto, Edad, Salario);
        empleados.add(nuevoEmpleado);

        // Actualizar la lista en la interfaz gráfica
        DefaultListModel<String> listModel = (DefaultListModel<String>) jList1.getModel();
        listModel.addElement(nuevoEmpleado.getNombre() + " " + nuevoEmpleado.getPrimerApellido() + " " + nuevoEmpleado.getSegundoApellido() + " es " + nuevoEmpleado.getPuestoDeTrabajo());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Crear el objeto Gson para deserializar
        Gson gson = new Gson();

        try {
            JFileChooser SelectFichero = new JFileChooser();

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichero permitidos", "java", "json", "csv", "xml");

            SelectFichero.setFileFilter(filter);

            SelectFichero.setCurrentDirectory(new File("."));

            int result = SelectFichero.showOpenDialog(null);

            System.out.println("Resultado " + result);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = SelectFichero.getSelectedFile();
                System.out.println("Filepath" + selectedFile);

                String extension = selectedFile.toString();
                System.out.println("TESTTEST:" + extension);

                String extension2 = selectedFile.getName();
                System.out.println("TESTTEST2222222:" + extension2);

                // Leer el contenido del archivo JSON
                BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile));

                // Deserializar el JSON a una lista de empleados
                Empleado[] empleadosArray = gson.fromJson(bufferedReader, Empleado[].class);

                // Convertir el array a una lista y agregar los empleados a la lista existente
                empleados.addAll(Arrays.asList(empleadosArray));

                // Cerrar el BufferedReader
                bufferedReader.close();

                // Actualizar el modelo del JList
                DefaultListModel<String> listModel = (DefaultListModel<String>) jList1.getModel();
                for (Empleado e : empleadosArray) {
                    listModel.addElement(e.getNombre() + " " + e.getPrimerApellido());
                }

                System.out.println("Empleados importados correctamente desde el archivo yeison2.json");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, "Archivo no encontrado", ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, "Error al leer el archivo", ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedIndex = jList1.getSelectedIndex(); // Obtener el índice del elemento seleccionado

        if (selectedIndex != -1) { // Verificar que haya un elemento seleccionado
            try {
                // Obtener los valores de los JTextField y realizar validaciones
                String nombre = jTextField1.getText();
                String apellido1 = jTextField2.getText();
                String apellido2 = jTextField3.getText();
                String puesto = jTextField4.getText();
                String edadTexto = jTextField5.getText(); // Obtener como texto
                String salarioTexto = jTextField6.getText(); // Obtener como texto

                // Verificar que los campos de edad y salario no estén vacíos
                if (edadTexto.isEmpty() || salarioTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Edad y salario no pueden estar vacíos.");
                    return;
                }

                // Convertir a enteros
                int edad = Integer.parseInt(edadTexto);
                int salario = Integer.parseInt(salarioTexto);

                // Actualizar el empleado en la lista
                Empleado empleadoModificado = new Empleado(nombre, apellido1, apellido2, puesto, edad, salario);
                empleados.set(selectedIndex, empleadoModificado);

                // Actualizar la lista en la interfaz gráfica
                DefaultListModel<String> listModel = (DefaultListModel<String>) jList1.getModel();
                listModel.set(selectedIndex, empleadoModificado.getNombre() + " " + empleadoModificado.getPrimerApellido() + " " + empleadoModificado.getSegundoApellido() + " es " + empleadoModificado.getPuestoDeTrabajo());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, introduce valores numéricos válidos para edad y salario.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un empleado para modificar.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // Asegurarse de que el cambio es definitivo
                    int selectedIndex = jList1.getSelectedIndex();
                    if (selectedIndex != -1) {
                        Empleado empleadoSeleccionado = empleados.get(selectedIndex);
                        // Llenar los JTextField con los datos del empleado seleccionado
                        jTextField1.setText(empleadoSeleccionado.getNombre());
                        jTextField2.setText(empleadoSeleccionado.getPrimerApellido());
                        jTextField3.setText(empleadoSeleccionado.getSegundoApellido());
                        jTextField4.setText(empleadoSeleccionado.getPuestoDeTrabajo());
                        jTextField5.setText(String.valueOf(empleadoSeleccionado.getEdad()));
                        jTextField6.setText(String.valueOf(empleadoSeleccionado.getSueldo()));
                    }
                }
            }
        });
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int selectedIndex = jList1.getSelectedIndex(); // Obtener el índice del elemento seleccionado

        if (selectedIndex != -1) { // Verificar que haya un elemento seleccionado
            try {

                empleados.remove(selectedIndex);

                DefaultListModel<String> listModel = new DefaultListModel<>();

                // Llenar el modelo con los empleados cargados
                for (Empleado e : empleados) {
                    listModel.addElement(e.getNombre() + " " + e.getPrimerApellido() + " " + e.getSegundoApellido());
                }

                jList1.setModel(listModel);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el empleado a eliminar");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String NombreFichero = JOptionPane.showInputDialog("Nombre del fichero");

        if (jComboBox1.getSelectedItem() == "json") {
            // Convertir la lista de empleados a JSON
            Gson gson = new Gson();
            String json = gson.toJson(empleados);
            System.out.println("Lista de empleados en formato JSON:");
            System.out.println(json);

            //Creamos el fichero con la lista de empleados en formato json
            try {
                FileWriter ficheroTexto = new FileWriter(NombreFichero + ".json");
                ficheroTexto.write(json);
                ficheroTexto.close();
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Creado el fichero yeison.json");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // Supongamos que GestorEmpleados tiene una lista de empleados ya creada

        Empleado e1 = new Empleado("Edu", "Lopez", "Hernandez", "Fontanero", 999, 27);
        Empleado e2 = new Empleado("Cristian", "Marrero", "Marrero", "Ingeniero", 1529, 28);
        Empleado e3 = new Empleado("David", "Trujillo", "Hernandez", "Piloto", 1250, 26);
        Empleado e4 = new Empleado("Raul", "Jimenez", "Jimenez", "Desarrollador", 1800, 26);

        // Crear una lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e4);
        /**
         * empleados.add(e1); empleados.add(e2); empleados.add(e3);
         * empleados.add(e4); System.out.println(empleados.size());
         *
         *
         * // Convertir la lista de empleados a JSON Gson gson = new Gson();
         * String json = gson.toJson(empleados); System.out.println("Lista de
         * empleados en formato JSON:"); System.out.println(json);
         *
         * //Creamos el fichero con la lista de empleados en formato json
         * FileWriter ficheroTexto = new FileWriter("yeison.json");
         * ficheroTexto.write(json); ficheroTexto.close();
         * System.out.println("Creado el fichero yeison.json");
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame(empleados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
