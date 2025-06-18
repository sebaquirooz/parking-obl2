package interfaz;
import dominio.*;
import java.util.*;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class variosReportes extends javax.swing.JFrame implements Observer{
    
    private Sistema sistema;
    
    private UtilDateModel model = new UtilDateModel();

   
    public variosReportes() {
        initComponents();
        
    }
    
    public variosReportes (Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
        this.cargarCompFecha();
        this.tabMovimientos();
        this.sistema.addObserver(this);
        update(null,null);              
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.cargarEstadia();
        this.cargarListaContratos();
        this.cargarListaEmpleados();
        this.cargarListaServicios();
        listaVehiculos.setListData(sistema.obtenerListaVehiculos());
    }
 
    
    private class MovListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        // este código se ejecutará al presionar el botón, obtengo cuál botón
        JButton cual = ((JButton) e.getSource());
        // código a completar según el botón presionado
        }
    }
    
    public void tabMovimientos(){
        cargarCompFecha();
        JPanel panelMovimientos = new JPanel(new GridLayout(4,3));
        panelMovimientos.setBounds(260, 80, 190, 140); 
        panelMovimientos.setPreferredSize(new Dimension(50,40));
        tabMovimientosBotones.add(panelMovimientos);
        
        String[] horarios = {"00:00 - 5:59", "6:00 - 11:59", "12:00 - 17:59", "18:00 - 23:59"};

        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 3; col++) {
                String texto = horarios[fila]; // el texto ahora depende de la columna
                JButton boton = new JButton(texto);
                boton.setBackground(Color.BLACK);
                boton.setForeground(Color.WHITE);
                boton.setMargin(new Insets(5, 5, 5, 5));
                boton.addActionListener(new MovListener());
                panelMovimientos.add(boton);
            }
        }
    }

    
     //Componente de libreria jdatepicker, hecho a mano
    public void cargarCompFecha(){
        LocalDate fechaActual = LocalDate.now();
        model.setDate(fechaActual.getYear(), fechaActual.getMonthValue(), fechaActual.getDayOfMonth());
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        tabMovimientos.add(datePicker);      
        datePicker.setBounds(30, 30, 150, 40);
    }
    
    
    //A revisar
    public Movimiento[] generarListaHistorial(){
        Vehiculo v = (Vehiculo) listaVehiculos.getSelectedValue();
        ArrayList<Entrada> entradas = v.getHistorial().getListaEntradas();
        ArrayList<Salida> salidas = v.getHistorial().getListaSalidas();
        ArrayList<Servicio> servicios = v.getHistorial().getListaServicios();
        ArrayList<Movimiento> movimientosVehiculo = new ArrayList<>();
        if (toggleEntradas.isSelected()){
            for (Entrada e: entradas){
                movimientosVehiculo.add(e);
            }
        }
        if (toggleSalidas.isSelected()){
            for (Salida s: salidas){
                movimientosVehiculo.add(s);
            }
        }
        if (toggleServicios.isSelected()){
            for (Servicio sa: servicios){
                movimientosVehiculo.add(sa);
            }
        }
        if (!toggleOrden.isSelected()){
            Collections.sort(movimientosVehiculo, new Comparator<Movimiento>() {
            @Override
            public int compare(Movimiento a, Movimiento b) {
                return a.getFechaYhora().compareTo(b.getFechaYhora());
            }
            }); 
        }
        else{
            Collections.sort(movimientosVehiculo, new Comparator<Movimiento>() {
            @Override
            public int compare(Movimiento a, Movimiento b) {
                return b.getFechaYhora().compareTo(a.getFechaYhora());
            }
            });
        }
        return movimientosVehiculo.toArray(new Movimiento[movimientosVehiculo.size()]);
    }
    
    public void cargarMovimientos(){
        DefaultTableModel modelo = (DefaultTableModel) tablaMovimientos.getModel();
        modelo.setRowCount(0);
        Movimiento[] historialSeleccionado = this.generarListaHistorial();
        for (int i = 0; i < historialSeleccionado.length; i++){
            Movimiento m = historialSeleccionado[i];
            String tipoMov = "";
            if (m instanceof Entrada){
                tipoMov = "Entrada | ";
            }
            else if (m instanceof Salida){
                tipoMov = "Salida | ";
            }
            String mov = tipoMov +m.toString();
            modelo.addRow(new Object[]{mov});
        }
    }
   
    public void cargarEstadia(){
        
        Salida salidaElegida = null;
        int maximo = 0;
        
        for (int i = 0; i < sistema.getListaSalidas().size(); i++) {
            if(sistema.getListaSalidas().get(i).getTiempoTotal()>maximo){
                maximo = sistema.getListaSalidas().get(i).getTiempoTotal();
                salidaElegida = sistema.getListaSalidas().get(i);
            }
        }
        
        if(salidaElegida == null){
            this.labelEstadia.setText("No hay ninguna estadía registada.");
        }
        else{
            this.labelEstadia.setText(salidaElegida.getVehiculo().getMarca() + " " + sistema.calcularTiempoTotal(salidaElegida));
        }
    }
    
    
    public  void cargarListaContratos(){
        HashMap<String, Integer> conteo = new HashMap<>();
        
        for (int i = 0; i < sistema.getListaContratos().size(); i++) {
            String nombreCliente = sistema.getListaContratos().get(i).getCliente().getNombre();
            conteo.put(nombreCliente, conteo.getOrDefault(nombreCliente,0)+1);
        }
        
        ArrayList<String> nombresClientes = new ArrayList<>(conteo.keySet());
        
        Collections.sort(nombresClientes, new Comparator<String>(){                    
        @Override
        public int compare(String a,String b){
            return Integer.compare(conteo.get(b),conteo.get(a));
            }
        });
        
        String[] resultados = new String[nombresClientes.size()];
        
        for (int i = 0; i < nombresClientes.size(); i++) {
            String nombre = nombresClientes.get(i);
            int cantidad = conteo.get(nombre);
            
            resultados[i] = nombre + " (" + cantidad + " )";
        }
        
        this.listaClientesContratos.setListData(resultados);
    }
    
    public void cargarListaEmpleados(){
        HashMap<String, Integer> conteo = new HashMap<>();
        
        for (int i = 0; i < sistema.getListaMovimientos().size(); i++) {
            String nombreEmpleado = sistema.getListaMovimientos().get(i).getEmpleado().getNombre();
            conteo.put(nombreEmpleado, conteo.getOrDefault(nombreEmpleado,0)+1);
        }
        
        ArrayList<String> nombresEmpleados = new ArrayList<>(conteo.keySet());
        
        
        Collections.sort(nombresEmpleados, new Comparator<String>(){                    
        @Override
        public int compare(String a,String b){
            return Integer.compare(conteo.get(a),conteo.get(b));
            }
        });
        
        String[] resultados = new String[nombresEmpleados.size()];
        for (int i = 0; i < nombresEmpleados.size(); i++) {
            String nombre = nombresEmpleados.get(i);
            int cantidad = conteo.get(nombre);
            resultados[i] = nombre + " (" + cantidad + " )";
        }
        
        this.listaEmpleadosMovs.setListData(resultados);
    }
    
    public void cargarListaServicios(){
        HashMap<String, Integer> conteo = new HashMap<>();
        
        for (int i = 0; i < sistema.getListaServicios().size(); i++) {
            String nombreServicio = sistema.getListaServicios().get(i).getTipo();
            conteo.put(nombreServicio, conteo.getOrDefault(nombreServicio,0)+1); //getOrDefault se fija si el servicio ya esta en el hashmap
        }
        
        ArrayList<String> nombresServicios = new ArrayList<>(conteo.keySet());
        
        Collections.sort(nombresServicios, new Comparator<String>(){                    
        @Override
        public int compare(String a ,String b){
            return Integer.compare(conteo.get(b),conteo.get(a));
            }
        });
        
        String[] resultados = new String[nombresServicios.size()];
        for (int i = 0; i < nombresServicios.size(); i++) {
            String nombre = nombresServicios.get(i);
            int cantidad = conteo.get(nombre);
            resultados[i] = nombre + " (" + cantidad + " )";
        }
        
        this.listaServiciosMasUtilizados.setListData(resultados);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiosHistorial = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabHistorial = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVehiculos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        toggleServicios = new javax.swing.JToggleButton();
        toggleEntradas = new javax.swing.JToggleButton();
        toggleSalidas = new javax.swing.JToggleButton();
        toggleOrden = new javax.swing.JToggleButton();
        exportarHistorial = new javax.swing.JButton();
        tabEstadisticas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientesContratos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEmpleadosMovs = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaServiciosMasUtilizados = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelEstadia = new javax.swing.JLabel();
        tabMovimientos = new javax.swing.JPanel();
        tabMovimientosBotones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        tabHistorial.setLayout(null);

        listaVehiculos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaVehiculosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaVehiculos);

        tabHistorial.add(jScrollPane2);
        jScrollPane2.setBounds(50, 50, 100, 190);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Movimientos");
        tabHistorial.add(jLabel3);
        jLabel3.setBounds(260, 20, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Vehiculo");
        tabHistorial.add(jLabel4);
        jLabel4.setBounds(60, 20, 100, 20);

        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Movimientos"
            }
        ));
        jScrollPane6.setViewportView(tablaMovimientos);

        tabHistorial.add(jScrollPane6);
        jScrollPane6.setBounds(170, 50, 370, 190);

        toggleServicios.setSelected(true);
        toggleServicios.setText("Servicios adicionales");
        toggleServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleServiciosActionPerformed(evt);
            }
        });
        tabHistorial.add(toggleServicios);
        toggleServicios.setBounds(560, 170, 150, 23);

        toggleEntradas.setSelected(true);
        toggleEntradas.setText("Entradas");
        toggleEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleEntradasActionPerformed(evt);
            }
        });
        tabHistorial.add(toggleEntradas);
        toggleEntradas.setBounds(560, 90, 150, 23);

        toggleSalidas.setSelected(true);
        toggleSalidas.setText("Salidas");
        toggleSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleSalidasActionPerformed(evt);
            }
        });
        tabHistorial.add(toggleSalidas);
        toggleSalidas.setBounds(560, 130, 150, 23);

        toggleOrden.setText("Ordenar por fecha");
        toggleOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleOrdenActionPerformed(evt);
            }
        });
        tabHistorial.add(toggleOrden);

        toggleOrden.setBounds(560, 50, 150, 23);

        exportarHistorial.setText("Exportar historial");
        exportarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarHistorialActionPerformed(evt);
            }
        });
        tabHistorial.add(exportarHistorial);
        exportarHistorial.setBounds(560, 210, 150, 23);

        jTabbedPane1.addTab("Historial", tabHistorial);
      
        tabEstadisticas.setLayout(null);

        jScrollPane1.setViewportView(listaClientesContratos);

        tabEstadisticas.add(jScrollPane1);
        jScrollPane1.setBounds(500, 60, 170, 130);

        jScrollPane4.setViewportView(listaEmpleadosMovs);

        tabEstadisticas.add(jScrollPane4);
        jScrollPane4.setBounds(260, 60, 170, 130);

        jScrollPane5.setViewportView(listaServiciosMasUtilizados);

        tabEstadisticas.add(jScrollPane5);
        jScrollPane5.setBounds(20, 60, 170, 130);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Servicios más utilizados");
        tabEstadisticas.add(jLabel5);
        jLabel5.setBounds(20, 30, 170, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Clientes con más contratos");
        tabEstadisticas.add(jLabel6);
        jLabel6.setBounds(500, 30, 200, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Empleados con menos movimientos");
        tabEstadisticas.add(jLabel7);
        jLabel7.setBounds(220, 30, 260, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Estadia más larga: ");
        tabEstadisticas.add(jLabel2);
        jLabel2.setBounds(30, 230, 140, 20);

        labelEstadia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabEstadisticas.add(labelEstadia);
        labelEstadia.setBounds(160, 230, 340, 20);

        jTabbedPane1.addTab("Estadisticas generales", tabEstadisticas);

        tabMovimientos.setLayout(null);

        tabMovimientosBotones.setLayout(new java.awt.GridLayout());
        tabMovimientos.add(tabMovimientosBotones);
        tabMovimientosBotones.setBounds(200, 30, 410, 200);

        jLabel1.setText("jLabel1");
        tabMovimientos.add(jLabel1);
        jLabel1.setBounds(470, 10, 90, 16);

        jLabel8.setText("jLabel1");
        tabMovimientos.add(jLabel8);
        jLabel8.setBounds(200, 10, 90, 16);

        jLabel9.setText("jLabel1");
        tabMovimientos.add(jLabel9);
        jLabel9.setBounds(340, 10, 90, 16);

        botonSeleccion.setText("Seleccionar");
        botonSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionActionPerformed(evt);
            }
        });
        tabMovimientos.add(botonSeleccion);
        botonSeleccion.setBounds(30, 70, 120, 23);

        jTabbedPane1.addTab("Movimientos", tabMovimientos);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(40, 40, 770, 310);

        setBounds(0, 0, 897, 404);
    }// </editor-fold>//GEN-END:initComponents

    private void listaVehiculosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaVehiculosValueChanged
        if(this.listaVehiculos.getSelectedValue() != null){
            this.cargarMovimientos();
        }
    }//GEN-LAST:event_listaVehiculosValueChanged

    private void toggleOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleOrdenActionPerformed
        update(null,null);
    }//GEN-LAST:event_toggleOrdenActionPerformed

    private void toggleEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleEntradasActionPerformed
        update(null,null);
    }//GEN-LAST:event_toggleEntradasActionPerformed

    private void toggleSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleSalidasActionPerformed
        update(null,null);
    }//GEN-LAST:event_toggleSalidasActionPerformed

    private void toggleServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleServiciosActionPerformed
        update(null,null);
    }//GEN-LAST:event_toggleServiciosActionPerformed


    private void exportarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarHistorialActionPerformed
        Movimiento[] historialSeleccionado = this.generarListaHistorial();
        ArchivoGrabacion historial = new ArchivoGrabacion(this.listaVehiculos.getSelectedValue().getMatricula()+".txt");
        for (Movimiento m: historialSeleccionado){
            String linea = "";
            if (m instanceof Entrada){
                linea = "Entrada | ";
            }
            else if (m instanceof Salida){
                linea = "Salida | ";
            }
            linea += m.toString();
            historial.grabarLinea(linea);
        }
        historial.cerrar();
    }//GEN-LAST:event_exportarHistorialActionPerformed

    private void botonSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionActionPerformed
        //ACA agarrar fecha cargar boitones etc

    }//GEN-LAST:event_botonSeleccionActionPerformed
    

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
            java.util.logging.Logger.getLogger(variosReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(variosReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(variosReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(variosReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new variosReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportarHistorial;
    private javax.swing.JButton botonSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelEstadia;
    private javax.swing.JList listaClientesContratos;
    private javax.swing.JList listaEmpleadosMovs;
    private javax.swing.JList listaServiciosMasUtilizados;
    private javax.swing.JList<Vehiculo> listaVehiculos;
    private javax.swing.ButtonGroup radiosHistorial;
    private javax.swing.JPanel tabEstadisticas;
    private javax.swing.JPanel tabHistorial;
    private javax.swing.JPanel tabMovimientos;
    private javax.swing.JPanel tabMovimientosBotones;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JToggleButton toggleEntradas;
    private javax.swing.JToggleButton toggleOrden;
    private javax.swing.JToggleButton toggleSalidas;
    private javax.swing.JToggleButton toggleServicios;
    // End of variables declaration//GEN-END:variables
}
