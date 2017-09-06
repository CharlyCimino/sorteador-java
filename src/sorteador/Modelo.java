
package sorteador;

import java.util.ArrayList;

public class Modelo 
{
    private ArchivadorTexto at;
    private ArrayList<String> lineas;
    
    public void cargarDatos(String s)
    {
        this.at = new ArchivadorTexto(s);
        this.lineas = at.leerLineas();
    }
    
    public String obtenerLineaRandom()
    {
        return this.lineas.get( (int) Math.floor(Math.random() * this.lineas.size() ) );
    }
}
