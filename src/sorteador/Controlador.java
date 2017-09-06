
package sorteador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.JFrameVista;

public class Controlador 
{
    private Modelo m;
    private JFrameVista v;

    public void iniciar()
    {
        this.m = new Modelo();
        this.v = new JFrameVista();
        this.v.cargarListener(new CargarHandler());
        this.v.sortearListener(new SortearHandler());
        this.v.iniciarVista();
    }
    
    private class CargarHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {   
            String ruta = v.seleccionarArchivoFuente();
            if ( !ruta.isEmpty() )
            {
                m.cargarDatos( ruta );
                v.activarBoton();
            }
        }
    }
    
    private class SortearHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            v.mostrarLinea( m.obtenerLineaRandom() );
        }
    }
}
