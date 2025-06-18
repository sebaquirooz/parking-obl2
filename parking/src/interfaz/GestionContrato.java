package interfaz;
import dominio.*;
import java.util.*;

public class GestionContrato extends javax.swing.JFrame implements Observer {
    
    private Sistema sistema;
    
    public GestionContrato() {
        initComponents();
    }

    public GestionContrato(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        sistema.addObserver(this);
        update(null,null);
    }
    
    @Override
    public void update(Observable o, Object object0) {
        listaVehiculosContrato.setListData(sistema.obtenerListaVehiculos());
        listaClientesContrato.setListData(sistema.obtenerListaClientes());
        listaEmpleadosContrato.setListData(sistema.obtenerListaEmpleados());
        listaContratos.setListData(sistema.obtenerListaContratos());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleadosContrato = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVehiculosContrato = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaClientesContrato = new javax.swing.JList<>();
        valorMensualContrato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaContratos = new javax.swing.JList<>();
        labelNroContrato = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labelVehiculo = new javax.swing.JLabel();
        labelEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Empleado");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 20, 70, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Vehiculo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cliente");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 20, 50, 20);

        jScrollPane1.setViewportView(listaEmpleadosContrato);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 50, 90, 130);

        jScrollPane2.setViewportView(listaVehiculosContrato);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 100, 130);

        jScrollPane3.setViewportView(listaClientesContrato);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(140, 50, 100, 130);

        valorMensualContrato.setText("Ingrese valor mensual");
        valorMensualContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMensualContratoActionPerformed(evt);
            }
        });
        getContentPane().add(valorMensualContrato);
        valorMensualContrato.setBounds(30, 200, 130, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Crear contrato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 200, 120, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Contratos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 100, 20);

        listaContratos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaContratosValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaContratos);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 270, 100, 130);

        labelNroContrato.setText("<Número de contrato>");
        getContentPane().add(labelNroContrato);
        labelNroContrato.setBounds(150, 390, 240, 16);

        labelValor.setText("<Valor>");
        getContentPane().add(labelValor);
        labelValor.setBounds(150, 270, 180, 16);

        labelCliente.setText("<Cliente>");
        getContentPane().add(labelCliente);
        labelCliente.setBounds(150, 330, 190, 16);

        labelVehiculo.setText("<Vehiculo>");
        getContentPane().add(labelVehiculo);
        labelVehiculo.setBounds(150, 300, 180, 16);

        labelEmpleado.setText("<Empleado>");
        getContentPane().add(labelEmpleado);
        labelEmpleado.setBounds(150, 360, 230, 16);

        setBounds(0, 0, 416, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void valorMensualContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMensualContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMensualContratoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vehiculo vehiculoSelecc = (Vehiculo) listaVehiculosContrato.getSelectedValue();
        Cliente clietneSelecc = (Cliente) listaClientesContrato.getSelectedValue();
        Empleado empleadoSelecc = (Empleado) listaEmpleadosContrato.getSelectedValue();
        sistema.registrarContrato(clietneSelecc, vehiculoSelecc, empleadoSelecc, Integer.parseInt(this.valorMensualContrato.getText()));
        
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaContratosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaContratosValueChanged
        Contrato contratoSelecc = listaContratos.getSelectedValue();
        String valorContrato = contratoSelecc.getValor() + "";
        String vehiculoContrato = contratoSelecc.getVehiculo().toString();
        String clienteContrato = contratoSelecc.getCliente().toString();
        String empleadoContrato = contratoSelecc.getEmpleado().toString();
        int numeroContrato = contratoSelecc.getNumeroContrato();
        
        this.labelCliente.setText(clienteContrato + " (Cliente)");
        this.labelEmpleado.setText(empleadoContrato + " (Empleado)");
        this.labelValor.setText(valorContrato+ " (Valor)");
        this.labelVehiculo.setText(vehiculoContrato + " (Vehículo)");
        this.labelNroContrato.setText("" + numeroContrato + " (Número contrato)");
    }//GEN-LAST:event_listaContratosValueChanged

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
            java.util.logging.Logger.getLogger(GestionContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelEmpleado;
    private javax.swing.JLabel labelNroContrato;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelVehiculo;
    private javax.swing.JList<Cliente> listaClientesContrato;
    private javax.swing.JList<Contrato> listaContratos;
    private javax.swing.JList<Empleado> listaEmpleadosContrato;
    private javax.swing.JList<Vehiculo> listaVehiculosContrato;
    private javax.swing.JTextField valorMensualContrato;
    // End of variables declaration//GEN-END:variables

}
