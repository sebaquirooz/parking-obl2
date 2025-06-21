//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package interfaz;
import dominio.*;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.*;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class movimientosEntradas extends javax.swing.JFrame implements Observer{

    private Sistema sistema;
    
    private UtilDateModel model = new UtilDateModel();
    
    public movimientosEntradas() {
        initComponents();
        aplicarTema();
    }
    
     public void aplicarTema() {
        Color fondo;
        Color texto;

        if (sistema.isModoOscuro()) {
            fondo = new Color(40, 40, 40);
            texto = Color.WHITE;
        } else {
            fondo = Color.WHITE;
            texto = Color.BLACK;
        }

        getContentPane().setBackground(fondo);

        for (Component c : getContentPane().getComponents()) {
            c.setBackground(fondo);
            c.setForeground(texto);
        }
    }
    
    public movimientosEntradas(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        this.cargarCompFecha();
        this.sistema.addObserver(this);
        update(null,null);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        notaEntrada.setText(" ");
        horaEntrada.setText("Ingrese hora (HH:MM)");
        labelContrato.setText("<Contrato>");
        listaVehiculosEstacionados.setListData(sistema.obtenerListaVehiculosNoEstacionado());
        listaEmpleados.setListData(sistema.obtenerListaEmpleados());
        aplicarTema();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVehiculosEstacionados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notaEntrada = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        registrarEntrada = new javax.swing.JButton();
        horaEntrada = new javax.swing.JTextField();
        labelContrato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entradas");
        getContentPane().setLayout(null);

        jScrollPane1.setToolTipText("");

        listaVehiculosEstacionados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaVehiculosEstacionadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaVehiculosEstacionados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 110, 120);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 170, 160, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha y hora");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 20, 100, 17);

        notaEntrada.setColumns(20);
        notaEntrada.setRows(5);
        jScrollPane2.setViewportView(notaEntrada);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 190, 250, 90);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Seleccionar vehiculo");
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

        registrarEntrada.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        registrarEntrada.setText("Registrar");
        registrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(registrarEntrada);
        registrarEntrada.setBounds(350, 220, 90, 23);

        horaEntrada.setText("Ingrese hora (HH:MM)");
        horaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(horaEntrada);
        horaEntrada.setBounds(190, 80, 140, 30);

        labelContrato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelContrato.setText("<Contrato>");
        getContentPane().add(labelContrato);
        labelContrato.setBounds(350, 190, 150, 17);

        setBounds(0, 0, 541, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEntradaActionPerformed
        Vehiculo vehiculoSeleccionado = (Vehiculo) listaVehiculosEstacionados.getSelectedValue();
        Empleado empleadoSeleccionado = (Empleado) listaEmpleados.getSelectedValue();
        
        Date fechaEntrada = model.getValue();
        String horaDeEntrada = horaEntrada.getText();
        LocalDate localDate = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaEnFormato = LocalTime.parse(horaDeEntrada, formatter);
        LocalDateTime fechayHora = LocalDateTime.of(localDate,horaEnFormato);
        
        String notaDeEntrada = notaEntrada.getText();
        if (listaVehiculosEstacionados.getSelectedValue() == null || listaEmpleados.getSelectedValue() == null || " ".equals(horaEntrada.getText()) || " ".equals(notaEntrada.getText()) ){
            // algo
        }
        else {
            sistema.registrarEntrada(vehiculoSeleccionado, empleadoSeleccionado,fechayHora , notaDeEntrada);
        }
                
        
        
    }//GEN-LAST:event_registrarEntradaActionPerformed

    private void horaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaEntradaActionPerformed

    private void listaVehiculosEstacionadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaVehiculosEstacionadosValueChanged
   if(!listaVehiculosEstacionados.isSelectionEmpty()){
    Vehiculo unVehiculo = (Vehiculo) listaVehiculosEstacionados.getSelectedValue();
    if(unVehiculo.getContrato() == null){
        this.labelContrato.setText("No tiene contrato");
    }
        else{
          this.labelContrato.setText("Tiene contrato");
        }
    }
    }//GEN-LAST:event_listaVehiculosEstacionadosValueChanged

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
            java.util.logging.Logger.getLogger(movimientosEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movimientosEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movimientosEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movimientosEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movimientosEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField horaEntrada;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContrato;
    private javax.swing.JList<Empleado> listaEmpleados;
    private javax.swing.JList<Vehiculo> listaVehiculosEstacionados;
    private javax.swing.JTextArea notaEntrada;
    private javax.swing.JButton registrarEntrada;
    // End of variables declaration//GEN-END:variables

}
