
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFrameVista extends javax.swing.JFrame 
{
    public JFrameVista() {
        initComponents();
    }
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.establecerIcono();
        this.setVisible(true);
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void mostrarLinea (String s)
    {
        this.jLabelSorteado.setText(s);
    }
    
    public void cargarListener (ActionListener al)
    {
        this.jMenuItem1.addActionListener( al );
    }
    
    public void sortearListener (ActionListener al)
    {
        this.jButtonSortear.addActionListener( al );
    }
    
    public void activarBoton()
    {
        this.jButtonSortear.setEnabled(true);
    }
    
    public String seleccionarArchivoFuente()
    {
        String ruta = "";
        
        JFileChooser explorador = new JFileChooser();
        explorador.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        explorador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = explorador.showOpenDialog(null);
        if (resultado != JFileChooser.CANCEL_OPTION)
        {
            ruta = explorador.getSelectedFile().getAbsolutePath();
        }
        
        return ruta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSortear = new javax.swing.JButton();
        jLabelSorteado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteador");
        setBackground(new java.awt.Color(237, 244, 252));
        setResizable(false);

        jButtonSortear.setBackground(new java.awt.Color(47, 81, 140));
        jButtonSortear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSortear.setForeground(new java.awt.Color(237, 244, 252));
        jButtonSortear.setText("SORTEAR");
        jButtonSortear.setEnabled(false);

        jLabelSorteado.setBackground(new java.awt.Color(237, 244, 252));
        jLabelSorteado.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabelSorteado.setForeground(new java.awt.Color(20, 34, 57));
        jLabelSorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSorteado.setText("SIN DATOS");

        jMenuBar1.setBackground(new java.awt.Color(63, 108, 186));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(237, 244, 252));
        jMenu1.setText("Datos");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(97, 134, 198));
        jMenuItem1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(237, 244, 252));
        jMenuItem1.setText("Cargar datos...");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSortear))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSortear;
    private javax.swing.JLabel jLabelSorteado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
