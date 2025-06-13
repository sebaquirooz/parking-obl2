package interfaz;
import dominio.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class movimientosServiciosAdicionales extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    
    private UtilDateModel model = new UtilDateModel();

    
    public movimientosServiciosAdicionales() {
        initComponents();
        cargarCompFecha();
    }

    
    public movimientosServiciosAdicionales(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        cargarCompFecha();
        sistema.addObserver(this);
        update(null,null);    
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        listaEmpleadosServicios.setListData(sistema.obtenerListaEmpleados());
        listaVehiculosServicios.setListData(sistema.obtenerVehiculoEstacionados());
        listaServiciosVehiculo.setListData(sistema.obtenerListaServicios());
        this.fechaSeleccionada.setText("<Fecha>");
        this.labelHora.setText("<Hora>");
        this.labelCosto.setText("<Costo>");
        this.costoServicio.setText("Ingrese costo del servicio");
    }
    
    
    //Componente de libreria jdatepicker, hecho a mano
    public void cargarCompFecha(){
        LocalDate fechaActual = LocalDate.now();
        model.setDate(fechaActual.getYear(), fechaActual.getMonthValue(), fechaActual.getDayOfMonth());
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        getContentPane().add(datePicker);      
        datePicker.setBounds(240, 110, 120, 20);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVehiculosServicios = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleadosServicios = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        costoServicio = new javax.swing.JTextField();
        comboServicios = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        botonRegistrarServicio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaServiciosVehiculo = new javax.swing.JList<>();
        fechaSeleccionada = new javax.swing.JLabel();
        labelCosto = new javax.swing.JLabel();
        horaServicio = new javax.swing.JTextField();
        labelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Servicios:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 170, 20);

        jScrollPane2.setViewportView(listaVehiculosServicios);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 100, 170);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Costo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 170, 70, 20);

        jScrollPane1.setViewportView(listaEmpleadosServicios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 50, 90, 170);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Empleado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 20, 70, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Servicio");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 20, 70, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Horario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 80, 70, 20);

        costoServicio.setText("Ingrese costo del servicio");
        getContentPane().add(costoServicio);
        costoServicio.setBounds(240, 190, 150, 22);

        comboServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavado", "Cambio de rueda", "Limpieza de tapizado", "Cambio de luces", "Otro" }));
        getContentPane().add(comboServicios);
        comboServicios.setBounds(240, 50, 145, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Vehiculo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 20, 100, 20);

        botonRegistrarServicio.setText("Registrar servicio");
        botonRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarServicioActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarServicio);
        botonRegistrarServicio.setBounds(130, 240, 130, 23);

        listaServiciosVehiculo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaServiciosVehiculoValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaServiciosVehiculo);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 310, 160, 110);

        fechaSeleccionada.setText("<Fecha>");
        getContentPane().add(fechaSeleccionada);
        fechaSeleccionada.setBounds(190, 320, 180, 16);

        labelCosto.setText("<Costo>");
        getContentPane().add(labelCosto);
        labelCosto.setBounds(190, 380, 180, 16);

        horaServicio.setText("Ingrese hora (HH:MM)");
        getContentPane().add(horaServicio);
        horaServicio.setBounds(240, 140, 150, 22);

        labelHora.setText("<Hora>");
        getContentPane().add(labelHora);
        labelHora.setBounds(190, 350, 180, 16);

        setBounds(0, 0, 416, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarServicioActionPerformed
        Vehiculo vehiculoElegido = (Vehiculo) this.listaVehiculosServicios.getSelectedValue();
        Empleado empleadoElegido = (Empleado) this.listaEmpleadosServicios.getSelectedValue();
        String servicioElegido = (String) this.comboServicios.getSelectedItem();
        Date fechaElegida = model.getValue();
        String horaElegida = this.horaServicio.getText();
        int costoElegido = Integer.parseInt(this.costoServicio.getText());
        LocalDate localDate = fechaElegida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaEnFormato = LocalTime.parse(horaElegida, formatter);
        LocalDateTime fechaYHora = LocalDateTime.of(localDate,horaEnFormato);
        
        
        if(vehiculoElegido == null || empleadoElegido == null || servicioElegido == null || fechaElegida == null){
           //Alerta algo no se eligio 
        }
        else{
            sistema.registrarServicio(vehiculoElegido, empleadoElegido, servicioElegido, fechaYHora, costoElegido);
                }
    }//GEN-LAST:event_botonRegistrarServicioActionPerformed

    private void listaServiciosVehiculoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaServiciosVehiculoValueChanged
        Servicio servicioElegido = (Servicio) this.listaServiciosVehiculo.getSelectedValue();
        this.fechaSeleccionada.setText(servicioElegido.getFechaYhora().getDayOfMonth() + "//" + servicioElegido.getFechaYhora().getMonthValue() + "//" + servicioElegido.getFechaYhora().getYear());
        this.labelHora.setText(servicioElegido.getFechaYhora().getHour() + ":" + servicioElegido.getFechaYhora().getMinute() + servicioElegido.getFechaYhora().getSecond());
        this.labelCosto.setText(servicioElegido.getCosto() + "");
    }//GEN-LAST:event_listaServiciosVehiculoValueChanged

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
            java.util.logging.Logger.getLogger(movimientosServiciosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movimientosServiciosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movimientosServiciosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movimientosServiciosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movimientosServiciosAdicionales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarServicio;
    private javax.swing.JComboBox<String> comboServicios;
    private javax.swing.JTextField costoServicio;
    private javax.swing.JLabel fechaSeleccionada;
    private javax.swing.JTextField horaServicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelHora;
    private javax.swing.JList<Empleado> listaEmpleadosServicios;
    private javax.swing.JList<Servicio> listaServiciosVehiculo;
    private javax.swing.JList<Vehiculo> listaVehiculosServicios;
    // End of variables declaration//GEN-END:variables
}
