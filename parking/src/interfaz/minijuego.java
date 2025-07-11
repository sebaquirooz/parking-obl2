//TRABAJO DESARROLLADO POR: SEBASTIÁN QUIROZ - 323189 | JUAN MANUEL REOLON - 331598//
package interfaz;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.*;

//CLASE HECHA POR IA CHATGPT:
public class minijuego extends javax.swing.JFrame {
    
    private GamePanel gamePanel;

    
    public minijuego() {
        initComponents();
        gamePanel = new GamePanel();
        this.setContentPane(gamePanel);
        this.pack();
        this.setLocationRelativeTo(null);
        gamePanel.requestFocusInWindow();

    }
class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = 500, HEIGHT = 500;
    private final int SIZE = 20;
    private int x = 100, y = 100;
    private int dx = 0, dy = 0;

    private int shadowX = 300, shadowY = 300;
    private final int DELAY = 20;
    private Timer timer;

    private LinkedList<Point> history = new LinkedList<>();
    private final int SHADOW_DELAY_STEPS = 20;

    private boolean gameOver = false;
    
    private java.util.List<Rectangle> walls = new LinkedList<>();
    private int wallTimer = 0;
    private final int WALL_INTERVAL = 2000 / DELAY; // cada 2 segundos
    private final int WALL_WIDTH = 40;
    private final int WALL_HEIGHT = 40;
    private boolean started = false;



    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        timer = new Timer(DELAY, this);
        timer.start();
        for (int i = 0; i < SHADOW_DELAY_STEPS; i++) {
            history.add(new Point(x, y)); // todas las posiciones iniciales iguales
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (!started) {
    String mensaje = "Presiona una tecla para empezar a jugar a 'La mancha'";

    // Estilo visual
    Font fuente = new Font("SansSerif", Font.BOLD, 18);
    g.setFont(fuente);
    FontMetrics fm = g.getFontMetrics(fuente);
    int textWidth = fm.stringWidth(mensaje);
    int textHeight = fm.getAscent();

    int x = (WIDTH - textWidth) / 2;
    int y = (HEIGHT + textHeight) / 2;

    // Fondo con sombra
    g.setColor(new Color(60, 60, 60)); // sombra
    g.drawString(mensaje, x + 2, y + 2);

    g.setColor(Color.WHITE); // texto principal
    g.drawString(mensaje, x, y);

    return;
}



    if (gameOver) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("¡Game Over!", WIDTH / 2 - 100, HEIGHT / 2);
        return;
    }

    // Dibujar paredes
    g.setColor(Color.RED);
    for (Rectangle wall : walls) {
        g.fillRect(wall.x, wall.y, wall.width, wall.height);
    }

    // Jugador
    g.setColor(Color.GREEN);
    g.fillRect(x, y, SIZE, SIZE);

    // Sombra
    g.setColor(Color.GRAY);
    g.fillRect(shadowX, shadowY, SIZE, SIZE);
}


    @Override

public void actionPerformed(ActionEvent e) {
    if (gameOver || !started) return;

    // Mover jugador
    x += dx;
    y += dy;
    x = Math.max(0, Math.min(x, WIDTH - SIZE));
    y = Math.max(0, Math.min(y, HEIGHT - SIZE));

    // Agregar nueva pared cada cierto tiempo
    wallTimer++;
    if (wallTimer >= WALL_INTERVAL) {
        wallTimer = 0;
        int wx = (int)(Math.random() * (WIDTH - WALL_WIDTH));
        int wy = (int)(Math.random() * (HEIGHT - WALL_HEIGHT));
        walls.add(new Rectangle(wx, wy, WALL_WIDTH, WALL_HEIGHT));
    }

    // Guardar historial de posición del jugador
    history.add(new Point(x, y));
    if (history.size() > SHADOW_DELAY_STEPS) {
        Point old = history.removeFirst();
        shadowX = old.x;
        shadowY = old.y;
    }

    // Verificar colisión con la sombra (ahora sí mata)
    if (Math.abs(x - shadowX) < SIZE && Math.abs(y - shadowY) < SIZE) {
        gameOver = true;
    }

    // Verificar colisión con paredes
    Rectangle jugador = new Rectangle(x, y, SIZE, SIZE);
    for (Rectangle wall : walls) {
        if (jugador.intersects(wall)) {
            gameOver = true;
        }
    }

    repaint();
}


   @Override
        public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();

    if (!started) {
        // Empieza el juego al presionar una tecla válida
        if (code == KeyEvent.VK_UP || code == KeyEvent.VK_DOWN ||
            code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT) {
            started = true;
        }
    }

    switch (code) {
        case KeyEvent.VK_UP -> { dx = 0; dy = -SIZE; }
        case KeyEvent.VK_DOWN -> { dx = 0; dy = SIZE; }
        case KeyEvent.VK_LEFT -> { dx = -SIZE; dy = 0; }
        case KeyEvent.VK_RIGHT -> { dx = SIZE; dy = 0; }
    }
}


    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Minijuego");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(minijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(minijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(minijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(minijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minijuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
