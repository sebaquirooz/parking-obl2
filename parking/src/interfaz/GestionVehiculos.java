package interfaz;
import dominio.*;
public class GestionVehiculos extends javax.swing.JFrame {
    
    private Sistema sistema;
    
    public GestionVehiculos() {
        initComponents();
    }

    public GestionVehiculos(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadoVehiculo = new javax.swing.JTextField();
        matriculaVehiculo = new javax.swing.JTextField();
        marcaVehiculo = new javax.swing.JTextField();
        modeloVehiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonVaciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVehiculo = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        notaVehiculoSeleccionado = new javax.swing.JLabel();
        matriculaVehiculoSeleccionado = new javax.swing.JLabel();
        marcaVehiculoSeleccionado = new javax.swing.JLabel();
        modeloVehiculoSeleccionado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrarVehiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        estadoVehiculo.setText("Ingrese estado");
        estadoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(estadoVehiculo);
        estadoVehiculo.setBounds(20, 170, 170, 22);

        matriculaVehiculo.setText("Ingrese matricula");
        matriculaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(matriculaVehiculo);
        matriculaVehiculo.setBounds(20, 50, 170, 22);

        marcaVehiculo.setText("Ingrese marca");
        marcaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(marcaVehiculo);
        marcaVehiculo.setBounds(20, 90, 170, 22);

        modeloVehiculo.setText("Ingrese modelo");
        getContentPane().add(modeloVehiculo);
        modeloVehiculo.setBounds(20, 130, 170, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Vehiculo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 190, 150, 17);

        botonVaciar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        botonVaciar.setText("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonVaciar);
        botonVaciar.setBounds(20, 240, 90, 23);

        jScrollPane1.setToolTipText("");

        jScrollPane1.setViewportView(listaVehiculo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 50, 110, 120);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 20, 10, 260);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Vehiculo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 20);

        notaVehiculoSeleccionado.setText("<Estado>");
        getContentPane().add(notaVehiculoSeleccionado);
        notaVehiculoSeleccionado.setBounds(220, 270, 100, 16);

        matriculaVehiculoSeleccionado.setText("<Matricula>");
        getContentPane().add(matriculaVehiculoSeleccionado);
        matriculaVehiculoSeleccionado.setBounds(220, 210, 70, 16);

        marcaVehiculoSeleccionado.setText("<Marca>");
        getContentPane().add(marcaVehiculoSeleccionado);
        marcaVehiculoSeleccionado.setBounds(300, 210, 70, 16);

        modeloVehiculoSeleccionado.setText("<Modelo>");
        getContentPane().add(modeloVehiculoSeleccionado);
        modeloVehiculoSeleccionado.setBounds(220, 240, 70, 16);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lista de vehiculos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 150, 17);

        registrarVehiculo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarVehiculo.setText("Registrar");
        registrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(registrarVehiculo);
        registrarVehiculo.setBounds(20, 210, 90, 23);

        setBounds(0, 0, 416, 309);
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaVehiculoActionPerformed

    private void marcaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaVehiculoActionPerformed

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVaciarActionPerformed

    private void estadoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoVehiculoActionPerformed

    private void registrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVehiculoActionPerformed
        String matriculaDelVehiculo = matriculaVehiculo.getText();
        String marcaDelVehiculo = marcaVehiculo.getText();
        String modeloDelVehiculo = modeloVehiculo.getText();
        String estadoDelVehiculo = estadoVehiculo.getText();
        if (" ".equals(matriculaVehiculo.getText()) || " ".equals(marcaVehiculo.getText()) || " ".equals(modeloVehiculo.getText()) || " ".equals(estadoVehiculo.getText())){
            // Alerta faltan campos por llenar
        }
        else{
            sistema.registrarVehiculo(matriculaDelVehiculo, marcaDelVehiculo, modeloDelVehiculo, estadoDelVehiculo);
        }
    }//GEN-LAST:event_registrarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVaciar;
    private javax.swing.JTextField estadoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listaVehiculo;
    private javax.swing.JTextField marcaVehiculo;
    private javax.swing.JLabel marcaVehiculoSeleccionado;
    private javax.swing.JTextField matriculaVehiculo;
    private javax.swing.JLabel matriculaVehiculoSeleccionado;
    private javax.swing.JTextField modeloVehiculo;
    private javax.swing.JLabel modeloVehiculoSeleccionado;
    private javax.swing.JLabel notaVehiculoSeleccionado;
    private javax.swing.JButton registrarVehiculo;
    // End of variables declaration//GEN-END:variables
}
