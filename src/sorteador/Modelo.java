
package sorteador;

import java.util.ArrayList;

public class Modelo 
{
    private ArrayList<String> lineas; // Mi colección de líneas en formato String
    
    public void cargarDatos(String r)
    {
        // El archivador de texto se instancia pasándole la ruta (en String) donde se encuentra el .txt
        ArchivadorTexto at = new ArchivadorTexto(r);
        this.lineas = at.leerLineas(); // Obtengo las líneas desde el archivo y se cargan en memoria RAM
    }
    
    public String obtenerLineaRandom()
    {
        // Se necesitan números aleatorios entre 0 y la longitud (menos 1) 
        int cantLineas = this.lineas.size(); // Cantidad de lineas
        int numRandom = (int) Math.floor(Math.random() * cantLineas); // Da entre 0 y (cantLineas-1)
        return this.lineas.get(numRandom); // Devuelvo la línea que esté en la posición numRandom
    }
}
