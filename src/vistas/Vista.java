
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Vista extends javax.swing.JFrame 
{
    public Vista() {
        initComponents();
    }
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // La aplicación por defecto se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.establecerLookAndFeel(); // OPCIONAL. Hace lucir a los componentes como si se tratase de un app nativa de Windows
        this.setVisible(true); // Hace la ventana visible
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
        // El jMenuItem1 "escuchará" el evento "click" y lanzará el código que está dentro de al
        this.jMenuItem1.addActionListener( al );
    }
    
    public void sortearListener (ActionListener al)
    {
        // El jButtonSortear "escuchará" el evento "click" y lanzará el código que está dentro de al
        this.jButtonSortear.addActionListener( al );
    }
    
    public void activarBoton()
    {
        this.jButtonSortear.setEnabled(true);
    }
    
    public String seleccionarArchivoFuente()
    {
        String ruta = ""; // Ruta inicial vacía
        
        // JFileChooser es un componente que permite trabajar con el árbol de archivos del sistema operativo
        JFileChooser explorador = new JFileChooser();
        explorador.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt")); // Filtra por archivos de texto
        explorador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Muestra archivos y carpetas
        int resultado = explorador.showOpenDialog(null); // Abre la ventana en modo "Abrir"
        if (resultado != JFileChooser.CANCEL_OPTION) // Si NO toca el botón de cancelar
        {
            // Me quedo con la ruta absoluta del archivo seleccionado por el usuario
            ruta = explorador.getSelectedFile().getAbsolutePath();
        }
        
        return ruta; // Devuelvo la ruta (OJO, pudo haber quedado vacía si es que tocó en cancelar)
    }
    
    private void establecerLookAndFeel ()
    {
        try 
        { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } 
        catch(Exception e)
        { 
            System.out.println("No se pudo cargar el Look & Feel");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabelSorteado = new javax.swing.JLabel();
        jButtonSortear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteador");
        setBackground(new java.awt.Color(237, 244, 252));
        setResizable(false);

        jLabelSorteado.setBackground(new java.awt.Color(237, 244, 252));
        jLabelSorteado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSorteado.setForeground(new java.awt.Color(20, 34, 57));
        jLabelSorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSorteado.setText("SIN DATOS");

        jButtonSortear.setText("SORTEAR");
        jButtonSortear.setEnabled(false);

        jMenu1.setText("Datos");

        jMenuItem1.setText("Cargar datos...");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(jButtonSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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
