
/**
 * Write a description of class doc here.
 * 
 * @author (Andrei Miu) 
 * @version (22/06/2020)
 * @param int x, String file
 * @return Devuelve el contenido de la fila X del File
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   
   
}
