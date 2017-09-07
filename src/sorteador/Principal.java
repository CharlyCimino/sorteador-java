
package sorteador;

import javax.swing.UIManager;

public class Principal 
{
    public static void main(String[] args) 
    {
        establecerLookAndFeel();
        // Todo esto vino por defecto del JFrame que creó NetBeans
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                // Acá no se instancia la vista como estaba antes.
                // Se debe instanciar e invocar al controlador de la aplicación.
                Controlador c = new Controlador();
                c.iniciar();
            }
        });
    }
    
    private static void establecerLookAndFeel ()
    {
        try 
        { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } 
        catch(Exception e)
        { 
        }
    }
}
