
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
        this.m = new Modelo(); // Instancio un nuevo modelo (COMPOSICION)
        this.v = new JFrameVista(); // Instancio una nueva vista (COMPOSICION)
        // Vinculo los eventos de la vista con el manejo que provee el controlador
        this.v.cargarListener(new CargarHandler());
        this.v.sortearListener(new SortearHandler());
        this.v.iniciarVista(); // Le ordeno a la vista que se muestre
    }
    
    private void cargar ()
    {
        String r = v.seleccionarArchivoFuente(); // Obtengo la ruta desde la vista
        if ( !r.isEmpty() ) // Si no está vacía
        {
            m.cargarDatos(r); // Le pido al modelo que cargue los datos que estén en esa ruta
            v.activarBoton(); // Activo el botón de sortear
        }
    }
    
    private void sortear ()
    {
        // La vista debe mostrar una línea provista por el modelo
        // ¿Sabe el controlador cómo se muestra la línea? NO. Eso es responsabilidad de la vista
        // ¿Sabe el controlador cómo se obtiene la línea? NO. Eso es responsabilidad del modelo
        v.mostrarLinea( m.obtenerLineaRandom() );
    }
    
    private class CargarHandler implements ActionListener
    {
        // CargarHandler será un objeto de tipo ActionListener
        // La interface ActionListener me obliga a implementar el método abstracto actionPerformed
        // Cuando ocurra el evento esperado, se ejecutará el código que esté dentro de actionPerformed
        @Override
        public void actionPerformed(ActionEvent e)
        {   
            // El parámetro e, de tipo ActionEvent contiene información respecto del evento ocurrido
            // Como todo parámetro, su uso es opcional, pero debe ser recibido obligatoriamente.
            cargar();
        }
    }
    
    private class SortearHandler implements ActionListener
    {
        // CargarHandler será un objeto de tipo ActionListener
        // La interface ActionListener me obliga a implementar el método abstracto actionPerformed
        // Cuando ocurra el evento esperado, se ejecutará el código que esté dentro de actionPerformed
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // El parámetro e, de tipo ActionEvent contiene información respecto del evento ocurrido
            // Como todo parámetro, su uso es opcional, pero debe ser recibido obligatoriamente.
            sortear();
        }
    }
}
