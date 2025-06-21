//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package interfaz;
import dominio.*;
import java.time.LocalDate;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import java.util.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Color;



public class GestionClientes extends javax.swing.JFrame implements Observer{

    private Sistema sistema;
    
    private UtilDateModel model = new UtilDateModel();
    
    public GestionClientes() {
        initComponents();
    }

    public GestionClientes(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        aplicarTema();
        sistema.addObserver(this);
        cargarCompFecha();
        update(null,null);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        nombreCliente.setText("Ingrese nombre");
        ciCliente.setText("Ingrese cédula");
        direccionCliente.setText("Ingrese dirección");
        celularCliente.setText("Ingrese número celular");
        listaCliente.setListData(sistema.obtenerListaClientes());
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
    //Componente de libreria jdatepicker, hecho a mano
    public void cargarCompFecha(){
        LocalDate fechaActual = LocalDate.now();
        model.setDate(fechaActual.getYear(), fechaActual.getMonthValue(), fechaActual.getDayOfMonth());
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        getContentPane().add(datePicker);      
        datePicker.setBounds(20, 200, 170, 22);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        celularCliente = new javax.swing.JTextField();
        nombreCliente = new javax.swing.JTextField();
        ciCliente = new javax.swing.JTextField();
        direccionCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        eliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCliente = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        añoIngresoCliente = new javax.swing.JLabel();
        nombreClienteSeleccionado = new javax.swing.JLabel();
        ciClienteSeleccionado = new javax.swing.JLabel();
        direccionClienteSeleccionado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Clientes");
        getContentPane().setLayout(null);

        celularCliente.setText("Ingrese celular");
        celularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularClienteActionPerformed(evt);
            }
        });
        getContentPane().add(celularCliente);
        celularCliente.setBounds(20, 170, 170, 20);

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
        eliminarCliente.setBounds(250, 330, 90, 23);

        jScrollPane1.setToolTipText("");

        listaCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaClienteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 50, 110, 120);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 20, 10, 340);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Cliente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 20);

        añoIngresoCliente.setText("<Año ingreso>");
        getContentPane().add(añoIngresoCliente);
        añoIngresoCliente.setBounds(220, 290, 150, 16);

        nombreClienteSeleccionado.setText("<Nombre>");
        getContentPane().add(nombreClienteSeleccionado);
        nombreClienteSeleccionado.setBounds(220, 200, 150, 16);

        ciClienteSeleccionado.setText("<CI>");
        getContentPane().add(ciClienteSeleccionado);
        ciClienteSeleccionado.setBounds(220, 260, 160, 16);

        direccionClienteSeleccionado.setText("<Dirección>");
        getContentPane().add(direccionClienteSeleccionado);
        direccionClienteSeleccionado.setBounds(220, 230, 140, 16);

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
        registrarCliente.setBounds(60, 240, 90, 23);

        setBounds(0, 0, 412, 396);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void ciClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciClienteActionPerformed

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
        if(!listaCliente.isSelectionEmpty()){
        Cliente clienteSelecc = (Cliente) listaCliente.getSelectedValue();
        
        sistema.eliminarCliente(clienteSelecc);
        }
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void celularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularClienteActionPerformed

    private void registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteActionPerformed
        String nombreDelCliente = nombreCliente.getText();
        String cedulaDelCliente = ciCliente.getText();
        String direccionDelCliente = direccionCliente.getText();
        String celularDelCliente = celularCliente.getText();
        int añoDeIngreso = model.getYear();
        if (" ".equals(nombreCliente.getText()) || " ".equals(ciCliente.getText()) || " ".equals(direccionCliente.getText()) || " ".equals(celularCliente.getText())){
            // Alerta faltan campos por llenar
        }
        else{
            sistema.registrarCliente(nombreDelCliente, cedulaDelCliente, direccionDelCliente, celularDelCliente, añoDeIngreso);
        }
    }//GEN-LAST:event_registrarClienteActionPerformed
    
    private void listaClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaClienteValueChanged
       if(!listaCliente.isSelectionEmpty()){
        Cliente clienteSelecc = (Cliente) listaCliente.getSelectedValue();
        String nombreCliente = clienteSelecc.getNombre();
        String cedulaCliente = clienteSelecc.getCedula();
        String direccionCliente = clienteSelecc.getDireccion();
        int momentoIngreso = clienteSelecc.getAñoIngreso();

        nombreClienteSeleccionado.setText(nombreCliente);
        ciClienteSeleccionado.setText(cedulaCliente);
        direccionClienteSeleccionado.setText(direccionCliente);
        añoIngresoCliente.setText(momentoIngreso + "");
       }
    }//GEN-LAST:event_listaClienteValueChanged

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
    private javax.swing.JTextField celularCliente;
    private javax.swing.JTextField ciCliente;
    private javax.swing.JLabel ciClienteSeleccionado;
    private javax.swing.JTextField direccionCliente;
    private javax.swing.JLabel direccionClienteSeleccionado;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Cliente> listaCliente;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JLabel nombreClienteSeleccionado;
    private javax.swing.JButton registrarCliente;
    // End of variables declaration//GEN-END:variables
}
