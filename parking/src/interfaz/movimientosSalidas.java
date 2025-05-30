package interfaz;
import dominio.*;
import java.time.LocalDate;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import java.util.*;

public class movimientosSalidas extends javax.swing.JFrame implements Observer{

    private Sistema sistema;
    
    private UtilDateModel model = new UtilDateModel();

    public movimientosSalidas() {
        initComponents();
    }

    public movimientosSalidas(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        cargarCompFecha();
        sistema.addObserver(this);
        update(null,null);
    }
    
      //Componente de libreria jdatepicker, hecho a mano
    public void cargarCompFecha(){
        LocalDate fechaActual = LocalDate.now();
        model.setDate(fechaActual.getYear(), fechaActual.getMonthValue(), fechaActual.getDayOfMonth());
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        getContentPane().add(datePicker);       
        datePicker.setBounds(190, 50, 140, 22);
    }
    
    public void update(Observable o, Object arg){
        this.listaEmpleados.setListData(sistema.obtenerListaEmpleados());
        this.listaEntradas.setListData(sistema.obtenerListaEntradas());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEntradas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        labelTiempoTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notaSalida = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        botonVaciar = new javax.swing.JButton();
        registrarSalida = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        horaSalida = new javax.swing.JTextField();

        jScrollPane4.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setToolTipText("");

        jScrollPane1.setViewportView(listaEntradas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 110, 120);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 170, 160, 17);

        labelTiempoTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTiempoTotal.setText("<Tiempo total>");
        getContentPane().add(labelTiempoTotal);
        labelTiempoTotal.setBounds(360, 200, 120, 17);

        notaSalida.setColumns(20);
        notaSalida.setRows(5);
        jScrollPane2.setViewportView(notaSalida);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 190, 250, 90);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Seleccionar entrada");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 160, 17);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(340, 20, 10, 150);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(180, 20, 3, 150);

        jScrollPane3.setToolTipText("");

        jScrollPane3.setViewportView(listaEmpleados);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(360, 40, 110, 120);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Seleccionar empleado");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 20, 160, 17);

        botonVaciar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        botonVaciar.setText("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonVaciar);
        botonVaciar.setBounds(360, 250, 90, 23);

        registrarSalida.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarSalida.setText("Registrar");
        registrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(registrarSalida);
        registrarSalida.setBounds(360, 220, 90, 23);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Fecha y hora");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 20, 100, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("<Contrato>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 180, 100, 17);

        horaSalida.setText("Ingrese hora (HH:MM)");
        horaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(horaSalida);
        horaSalida.setBounds(190, 80, 140, 30);

        setBounds(0, 0, 557, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVaciarActionPerformed

    private void registrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSalidaActionPerformed
        Entrada entrada = (Entrada) listaEntradas.getSelectedValue();
        Empleado empleadoSeleccionado = (Empleado) listaEmpleados.getSelectedValue();
        Date fechaSalida = model.getValue();
        String horaDeSalida = horaSalida.getText();
        String notaDeSalida = notaSalida.getText();
        if (listaEntradas.getSelectedValue() == null || listaEmpleados.getSelectedValue() == null || !sistema.verificarHora(horaDeSalida) || " ".equals(notaSalida.getText()) ){
            // algo
        }
        else {
            Salida salidaNueva = sistema.registrarSalida(entrada, empleadoSeleccionado, fechaSalida, horaDeSalida, notaDeSalida);
            if (salidaNueva != null){ // esto pa que entre solo si existe el objeto, si no existe devuelve un null entonces no entra
                labelTiempoTotal.setText(salidaNueva.calcularTiempoTotal());
            }
            update(null,null);
        }
    }//GEN-LAST:event_registrarSalidaActionPerformed

    private void horaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(movimientosSalidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movimientosSalidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movimientosSalidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movimientosSalidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movimientosSalidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVaciar;
    private javax.swing.JTextField horaSalida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelTiempoTotal;
    private javax.swing.JList<Empleado> listaEmpleados;
    private javax.swing.JList listaEntradas;
    private javax.swing.JTextArea notaSalida;
    private javax.swing.JButton registrarSalida;
    // End of variables declaration//GEN-END:variables
}
