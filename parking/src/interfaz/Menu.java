package interfaz;
import dominio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.JOptionPane;



public class Menu extends javax.swing.JFrame {
    
    private Sistema sistema; 


    public Menu() {
        initComponents();
    }
    
    
    public Menu(Sistema unSistema){
        this.sistema = unSistema;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        opcionCliente = new javax.swing.JMenuItem();
        opcionVehiculos = new javax.swing.JMenuItem();
        opcionEmpleados = new javax.swing.JMenuItem();
        opcionContratos = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        buttonGrabacion = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuRecuperacion = new javax.swing.JMenuItem();
        menuGrabacion = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestión");

        opcionCliente.setText("Gestión de Clientes");
        opcionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionClienteActionPerformed(evt);
            }
        });
        fileMenu.add(opcionCliente);

        opcionVehiculos.setText("Gestión de Vehículos");
        opcionVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionVehiculosActionPerformed(evt);
            }
        });
        fileMenu.add(opcionVehiculos);

        opcionEmpleados.setText("Gestión de Empleados");
        opcionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEmpleadosActionPerformed(evt);
            }
        });
        fileMenu.add(opcionEmpleados);

        opcionContratos.setText("Gestión de Contratos");
        opcionContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionContratosActionPerformed(evt);
            }
        });
        fileMenu.add(opcionContratos);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Movimientos");

        jMenuItem7.setText("Entradas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem7);

        jMenuItem8.setText("Salidas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem8);

        jMenuItem12.setText("Servicios Adicionales");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem12);

        menuBar.add(editMenu);

        buttonGrabacion.setMnemonic('h');
        buttonGrabacion.setText("Varios");
        buttonGrabacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGrabacionActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Reportes");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        buttonGrabacion.add(jMenuItem9);

        menuRecuperacion.setText("Recuperación de datos");
        menuRecuperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecuperacionActionPerformed(evt);
            }
        });
        buttonGrabacion.add(menuRecuperacion);

        menuGrabacion.setText("Grabación de datos");
        menuGrabacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGrabacionActionPerformed(evt);
            }
        });
        buttonGrabacion.add(menuGrabacion);

        jMenuItem11.setText("Información de Autores");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        buttonGrabacion.add(jMenuItem11);

        jMenuItem10.setText("MiniJuego");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        buttonGrabacion.add(jMenuItem10);

        menuBar.add(buttonGrabacion);

        jMenu1.setText("Terminar");

        jMenuItem13.setText("Salir");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        setBounds(0, 0, 416, 311);
    }// </editor-fold>//GEN-END:initComponents


    private void opcionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GestionClientes ventanaGestionClientes = new GestionClientes(sistema);
        ventanaGestionClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opcionVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       GestionVehiculos ventanaGestionVehiculos = new GestionVehiculos(sistema);
       ventanaGestionVehiculos.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void opcionContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        GestionContrato ventanaGestionContrato = new GestionContrato(sistema);
        ventanaGestionContrato.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void opcionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        GestionEmpleados ventanaGestionEmpleados = new GestionEmpleados(sistema);
        ventanaGestionEmpleados.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        movimientosEntradas ventanaMovimientosEntradas = new movimientosEntradas(sistema);
        ventanaMovimientosEntradas.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        movimientosSalidas ventanaMovimientoSalidas = new movimientosSalidas(sistema);
        ventanaMovimientoSalidas.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        variosReportes ventanaVariosReportes = new variosReportes(sistema);
        ventanaVariosReportes.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void menuRecuperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecuperacionActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirma querer recuperar los datos? En caso de no haber datos guardados, se reiniciara el sistema.", "Recuperación de datos.",JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Datos recuperados.", "Recuperación de datos", -1);
            Persistencia.cargarSistema();
        }
        else {
            JOptionPane.showMessageDialog(null, "Grabación de datos cancelada.", "Grabación de datos", -1);
        }
    }//GEN-LAST:event_menuRecuperacionActionPerformed

    private void menuGrabacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGrabacionActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirma querer grabar los datos?", "Grabación de datos.",JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Datos grabados.", "Grabación de datos", -1);
            Persistencia.guardarSistema(sistema);
        }
        else {
            JOptionPane.showMessageDialog(null, "Grabación de datos cancelada.", "Grabación de datos", -1);
        }
    }//GEN-LAST:event_menuGrabacionActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        minijuego ventanaMinijuego = new minijuego();
        ventanaMinijuego.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        movimientosServiciosAdicionales ventanaMovServicios = new movimientosServiciosAdicionales(sistema);
        ventanaMovServicios.setVisible(true);

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void buttonGrabacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGrabacionActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirma querer grabar los datos?", "Grabación de datos.",JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Datos grabados.", "Grabación de datos", -1);
            Persistencia.guardarSistema(sistema);
        }
        else {
            JOptionPane.showMessageDialog(null, "Grabación de datos cancelada.", "Grabación de datos", -1);
        }
    }//GEN-LAST:event_buttonGrabacionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu buttonGrabacion;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuGrabacion;
    private javax.swing.JMenuItem menuRecuperacion;
    private javax.swing.JMenuItem opcionCliente;
    private javax.swing.JMenuItem opcionContratos;
    private javax.swing.JMenuItem opcionEmpleados;
    private javax.swing.JMenuItem opcionVehiculos;
    // End of variables declaration//GEN-END:variables

}
