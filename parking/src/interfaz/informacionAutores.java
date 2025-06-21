package interfaz;
import dominio.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

 class informacionAutores extends javax.swing.JFrame {
     
     private Sistema sistema;
     
    public informacionAutores(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        cargarImagenes();
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

    public void cargarImagenes() {
    ImageIcon iconoOriginal = new ImageIcon(informacionAutores.class.getResource("/dominio/imagenes/JUANREOLON.jpg"));
    Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
    Juan.setIcon(iconoEscalado);
    
    ImageIcon fotoSebastian = new ImageIcon(informacionAutores.class.getResource("/dominio/imagenes/SEBASTIANQUIROZ.jpg"));
    Image imagenEscaladaSebastian = fotoSebastian.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon iconoEscaladoSebastian = new ImageIcon(imagenEscaladaSebastian);
    Sebastian.setIcon(iconoEscaladoSebastian);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sebastian = new javax.swing.JLabel();
        Juan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de Autores");
        getContentPane().setLayout(null);

        Sebastian.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(Sebastian);
        Sebastian.setBounds(320, -10, 270, 280);

        Juan.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(Juan);
        Juan.setBounds(40, -10, 270, 280);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Sebastián Quiroz - 323189");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 270, 220, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Juan Manuel Reolon - 331598");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 270, 220, 20);

        setBounds(0, 0, 598, 357);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Juan;
    private javax.swing.JLabel Sebastian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
