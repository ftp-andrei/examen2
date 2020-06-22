
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
   
   /**
    * @resumen Devuelve la posicion geografica (Latitud y altitud) dandole el nombre de una calle.
    * @entrada String calle. Una calle.
    * @salida int latitud int altitud. La posicion geografica
    * @precondicion No se pueden insertar caracteres raros (tipo $~@€¬). Que la direccion sea valida.
    * @postcondicion Devuelve la posicion geografica si todo esta bien.
    */
   // Devuelve la posicion geografica (latitud y altitud) dada una calle.
   public abstract int posicionGeografica(String calle);
   
}
