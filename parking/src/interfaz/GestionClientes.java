package interfaz;
public class GestionClientes extends javax.swing.JFrame {

    public GestionClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresoCliente = new javax.swing.JTextField();
        nombreCliente = new javax.swing.JTextField();
        ciCliente = new javax.swing.JTextField();
        direccionCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        eliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCliente = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        añoIngresoCliente = new javax.swing.JLabel();
        nombreClienteSeleccionado = new javax.swing.JLabel();
        ciClienteSeleccionado = new javax.swing.JLabel();
        direccionClienteSeleccionado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrarCliente = new javax.swing.JButton();
        registrarCliente1 = new javax.swing.JButton();
        registrarCliente2 = new javax.swing.JButton();
        registrarCliente3 = new javax.swing.JButton();
        botonVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ingresoCliente.setText("Ingrese fecha de ingreso");
        ingresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresoCliente);
        ingresoCliente.setBounds(20, 170, 170, 22);

        nombreCliente.setText("Ingrese nombre");
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(nombreCliente);
        nombreCliente.setBounds(20, 50, 170, 22);

        ciCliente.setText("Ingrese cédula");
        ciCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ciCliente);
        ciCliente.setBounds(20, 90, 170, 22);

        direccionCliente.setText("Ingrese dirección");
        getContentPane().add(direccionCliente);
        direccionCliente.setBounds(20, 130, 170, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Empleado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 180, 150, 17);

        eliminarCliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        eliminarCliente.setText("Eliminar");
        eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCliente);
        eliminarCliente.setBounds(220, 260, 90, 23);

        jScrollPane1.setToolTipText("");

        listaCliente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 50, 110, 120);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 20, 10, 260);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Cliente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 20);

        añoIngresoCliente.setText("<Año ingreso>");
        getContentPane().add(añoIngresoCliente);
        añoIngresoCliente.setBounds(300, 230, 100, 16);

        nombreClienteSeleccionado.setText("<Nombre>");
        getContentPane().add(nombreClienteSeleccionado);
        nombreClienteSeleccionado.setBounds(220, 200, 70, 16);

        ciClienteSeleccionado.setText("<CI>");
        getContentPane().add(ciClienteSeleccionado);
        ciClienteSeleccionado.setBounds(300, 200, 70, 16);

        direccionClienteSeleccionado.setText("<Dirección>");
        getContentPane().add(direccionClienteSeleccionado);
        direccionClienteSeleccionado.setBounds(220, 230, 70, 16);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lista de clientes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 150, 17);

        registrarCliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarCliente.setText("Registrar");
        registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(registrarCliente);
        registrarCliente.setBounds(20, 210, 90, 23);

        registrarCliente1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarCliente1.setText("Registrar");
        registrarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCliente1ActionPerformed(evt);
            }
        });
        getContentPane().add(registrarCliente1);
        registrarCliente1.setBounds(20, 210, 90, 23);

        registrarCliente2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarCliente2.setText("Registrar");
        registrarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCliente2ActionPerformed(evt);
            }
        });
        getContentPane().add(registrarCliente2);
        registrarCliente2.setBounds(20, 210, 90, 23);

        registrarCliente3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarCliente3.setText("Registrar");
        registrarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCliente3ActionPerformed(evt);
            }
        });
        getContentPane().add(registrarCliente3);
        registrarCliente3.setBounds(20, 210, 90, 23);

        botonVaciar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        botonVaciar.setText("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonVaciar);
        botonVaciar.setBounds(20, 240, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void ciClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciClienteActionPerformed

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void ingresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoClienteActionPerformed

    private void registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarClienteActionPerformed

    private void registrarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarCliente1ActionPerformed

    private void registrarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarCliente2ActionPerformed

    private void registrarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarCliente3ActionPerformed

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVaciarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel añoIngresoCliente;
    private javax.swing.JButton botonVaciar;
    private javax.swing.JTextField ciCliente;
    private javax.swing.JLabel ciClienteSeleccionado;
    private javax.swing.JTextField direccionCliente;
    private javax.swing.JLabel direccionClienteSeleccionado;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JTextField ingresoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listaCliente;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JLabel nombreClienteSeleccionado;
    private javax.swing.JButton registrarCliente;
    private javax.swing.JButton registrarCliente1;
    private javax.swing.JButton registrarCliente2;
    private javax.swing.JButton registrarCliente3;
    // End of variables declaration//GEN-END:variables
}
