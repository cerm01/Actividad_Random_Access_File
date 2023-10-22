
package com.mycompany.random.access.file;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    Random_Access_File r;

    public Main() {
        initComponents();
        r = new Random_Access_File();
    }

    public void clean(){
        txtBuscar.setText("");
        txtPosicion.setText("");
        txtNumero.setText("");
        txtMostrar.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar4 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPosicion = new javax.swing.JTextField();
        lblPosicion = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnCrearArchivo = new javax.swing.JButton();
        btnAgregarInicio = new javax.swing.JButton();
        btnAgregarFinal = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtMostrar = new javax.swing.JTextField();
        lblLista = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        btnBuscar4.setText("Buscar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtPosicion.setEditable(false);

        lblPosicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosicion.setText("Posición");

        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero.setText("Número");

        btnCrearArchivo.setText("Crear Archivo");
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });

        btnAgregarInicio.setText("Agregar Inicio");
        btnAgregarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInicioActionPerformed(evt);
            }
        });

        btnAgregarFinal.setText("Agregar Final");
        btnAgregarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFinalActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtMostrar.setEditable(false);

        lblLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLista.setText("Lista");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMostrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoActionPerformed
        //Del archivo Random_Access_File.java se debe llamar al método CreateFile()
        try {
            r.CreateFile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar crear el archivo");
            e.printStackTrace();
        }
        clean();
    }//GEN-LAST:event_btnCrearArchivoActionPerformed

    private void btnAgregarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInicioActionPerformed
        String numero = txtNumero.getText();

        if ((!numero.isEmpty()) && (numero.matches("^[+-]?\\d*\\.?\\d+$"))) {
            try {
                double num = Double.parseDouble(numero);
                // Verificar si el número ya existe 
                if (r.Buscar(num) == -1) {
                    r.AddBeginning(num);
                    // Mostrar una ventana emergenete para avisar que se agrego el número
                    JOptionPane.showMessageDialog(null, "Se agrego el número correctamente");
                } else{
                    JOptionPane.showMessageDialog(null, "El número ya existe");
                }
                
                //r.AddBeginning(num);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido");
        }

        // Limpiar el campo de texto txtNumero
        clean();

    }//GEN-LAST:event_btnAgregarInicioActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try {
            //r.Print(); // Llama al método print de Random_Access_File
            String contenido = r.Print(); // Nueva función para leer el contenido
            txtMostrar.setText(contenido); // Muestra el contenido en txtMostrar
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al mostrar el archivo");
        }
        txtBuscar.setText("");
        txtPosicion.setText("");
        txtNumero.setText("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        clean();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFinalActionPerformed
        String numero = txtNumero.getText();

        if ((!numero.isEmpty()) && (numero.matches("^[+-]?\\d*\\.?\\d+$"))) {
            try {
                double num = Double.parseDouble(numero);
                
                // Verificar si el número ya existe 
                if (r.Buscar(num) == -1) {
                    r.AddEnd(num);
                    // Mostrar una ventana emergenete para avisar que se agrego el número
                    JOptionPane.showMessageDialog(null, "Se agrego el número correctamente");
                } else{
                    JOptionPane.showMessageDialog(null, "El número ya existe");
                }
                
                //r.AddEnd(num);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido");
        }

        // Limpiar el campo de texto txtNumero
        clean();
    }//GEN-LAST:event_btnAgregarFinalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorTexto = txtBuscar.getText();
        if (!valorTexto.isEmpty() && valorTexto.matches("^[+-]?\\d*\\.?\\d+$")) {
            double valor = Double.parseDouble(valorTexto);
            try {
                long posicion = r.Buscar(valor);
                if (posicion != -1) {
                    txtPosicion.setText(String.valueOf(posicion));
                    // Mostrar numero que se encontro en la posicion
                    txtNumero.setText(String.valueOf(valor));
                } else {
                    JOptionPane.showMessageDialog(null, "Valor no encontrado");
                    clean();
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al buscar el valor");
                clean();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
            clean();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String posicionTexto = txtPosicion.getText();
        if (!posicionTexto.isEmpty() && posicionTexto.matches("^[0-9]+$")) {
            long posicion = Long.parseLong(posicionTexto);
            try {
                boolean eliminado = r.Eliminar(posicion);
                if (eliminado) {
                    JOptionPane.showMessageDialog(null, "Valor eliminado correctamente en la posición " + posicion);
                } else {
                    JOptionPane.showMessageDialog(null, "La posición especificada no es válida");
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al eliminar el valor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una posición válida");
        }
        clean();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String posicionTexto = txtPosicion.getText();
        String numeroTexto = txtNumero.getText();

        if ((!numeroTexto.isEmpty()) && (numeroTexto.matches("^[+-]?\\d*\\.?\\d+$"))){
            long posicion = Long.parseLong(posicionTexto);
            double numero = Double.parseDouble(numeroTexto);
            try {
                if (r.Buscar(numero) == -1) {
                    boolean editado = r.Editar(posicion, numero);
                    if (editado) {
                        JOptionPane.showMessageDialog(null, "Valor editado correctamente en la posición " + posicion);
                    } else {
                        JOptionPane.showMessageDialog(null, "La posición especificada no es válida");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "El número ya existe");
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al editar el valor");
            }
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFinal;
    private javax.swing.JButton btnAgregarInicio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton btnCrearArchivo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMostrar;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
