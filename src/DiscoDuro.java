/**
 * Interfaz que representa un disco duro.
 * Define los metodos que deben implementar todas las clases de discos duros.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface DiscoDuro {
    /**
     * Obtiene una descripcion del disco duro.
     * @return Una cadena que describe al disco duro.
     */
    String getDescription();

    /**
     * Obtiene el precio del disco duro.
     * @return El precio del disco duro.
     */
    double getPrecio();

    /**
     * Obtiene una descripcion de la gama del disco duro.
     * @return Una cadena que describe la gama del disco duro.
     */
    String getGama();
}
