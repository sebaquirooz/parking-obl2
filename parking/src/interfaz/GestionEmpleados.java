package interfaz;
import dominio.*;
import java.util.*;

public class GestionEmpleados extends javax.swing.JFrame implements Observer{

    private Sistema sistema;

    public GestionEmpleados() {
        initComponents();
    }

    public GestionEmpleados(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        sistema.addObserver(this);
        update(null,null);
    }
    
    public void update(Observable o, Object object0) {
        nombreEmpleado.setText("Ingrese nombre");
        ciEmpleado.setText("Ingrese cédula");
        direccionEmpleado.setText("Ingrese dirección");
        numEmpleado.setText("Ingrese número de empleado");
        listaEmpleados.setListData(sistema.obtenerListaEmpleados());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numEmpleado = new javax.swing.JTextField();
        nombreEmpleado = new javax.swing.JTextField();
        ciEmpleado = new javax.swing.JTextField();
        direccionEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        registrarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        numEmpleadoSeleccionado = new javax.swing.JLabel();
        nombreEmpleadoSeleccionado = new javax.swing.JLabel();
        ciEmpleadoSeleccionado = new javax.swing.JLabel();
        direccionEmpleadoSeleccionado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        numEmpleado.setText("Ingrese número de empleado");
        getContentPane().add(numEmpleado);
        numEmpleado.setBounds(20, 170, 170, 22);

        nombreEmpleado.setText("Ingrese nombre");
        nombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreEmpleado);
        nombreEmpleado.setBounds(20, 50, 170, 22);

        ciEmpleado.setText("Ingrese cédula");
        ciEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(ciEmpleado);
        ciEmpleado.setBounds(20, 90, 170, 22);

        direccionEmpleado.setText("Ingrese dirección");
        getContentPane().add(direccionEmpleado);
        direccionEmpleado.setBounds(20, 130, 170, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Empleado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 190, 150, 17);

        registrarEmpleado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarEmpleado.setText("Registrar");
        registrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(registrarEmpleado);
        registrarEmpleado.setBounds(50, 210, 90, 23);

        jScrollPane1.setToolTipText("");

        listaEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaEmpleados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 50, 110, 120);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 20, 10, 260);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Empleado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 20);

        numEmpleadoSeleccionado.setText("<Num Emplado>");
        getContentPane().add(numEmpleadoSeleccionado);
        numEmpleadoSeleccionado.setBounds(220, 270, 170, 16);

        nombreEmpleadoSeleccionado.setText("<Nombre>");
        getContentPane().add(nombreEmpleadoSeleccionado);
        nombreEmpleadoSeleccionado.setBounds(220, 210, 160, 20);

        ciEmpleadoSeleccionado.setText("<CI>");
        getContentPane().add(ciEmpleadoSeleccionado);
        ciEmpleadoSeleccionado.setBounds(220, 300, 150, 16);

        direccionEmpleadoSeleccionado.setText("<Dirección>");
        getContentPane().add(direccionEmpleadoSeleccionado);
        direccionEmpleadoSeleccionado.setBounds(220, 240, 160, 16);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lista de empleados:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 150, 17);

        setBounds(0, 0, 420, 378);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoActionPerformed

    private void ciEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciEmpleadoActionPerformed

    private void registrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleadoActionPerformed
        String nombreDelEmpleado = nombreEmpleado.getText();
        String cedulaDelEmpleado = ciEmpleado.getText();
        String direccionDelEmpleado = direccionEmpleado.getText();
        int numDelEmpleado = Integer.parseInt(numEmpleado.getText());
        if (" ".equals(nombreEmpleado.getText()) || " ".equals(ciEmpleado.getText()) || " ".equals(direccionEmpleado.getText()) || " ".equals(numEmpleado.getText())){
            // Alerta faltan campos por llenar
        }
        else{
            sistema.registrarEmpleado(nombreDelEmpleado, cedulaDelEmpleado, direccionDelEmpleado, numDelEmpleado);            
        }
    }//GEN-LAST:event_registrarEmpleadoActionPerformed

    private void listaEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEmpleadosValueChanged
        if(!listaEmpleados.isSelectionEmpty()){
        Empleado empleadoSeleccionado = (Empleado) listaEmpleados.getSelectedValue();
        nombreEmpleadoSeleccionado.setText(empleadoSeleccionado.getNombre());
        ciEmpleadoSeleccionado.setText(empleadoSeleccionado.getCedula());
        direccionEmpleadoSeleccionado.setText(empleadoSeleccionado.getDireccion());
        numEmpleadoSeleccionado.setText(empleadoSeleccionado.getNumeroEmpleado() + "");
        }
    }//GEN-LAST:event_listaEmpleadosValueChanged

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
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ciEmpleado;
    private javax.swing.JLabel ciEmpleadoSeleccionado;
    private javax.swing.JTextField direccionEmpleado;
    private javax.swing.JLabel direccionEmpleadoSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Empleado> listaEmpleados;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JLabel nombreEmpleadoSeleccionado;
    private javax.swing.JTextField numEmpleado;
    private javax.swing.JLabel numEmpleadoSeleccionado;
    private javax.swing.JButton registrarEmpleado;
    // End of variables declaration//GEN-END:variables

}
