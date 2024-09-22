/**
 * Interfaz que representa una unidad central de procesamiento (CPU).
 * Define los metodos que deben implementar todas las clases de CPU.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface CPU {
    /**
     * Obtiene el tipo de socket de la CPU.
     * @return El tipo de socket
     */
    String getSocketType();

    /**
     * Obtiene una descripcion de la CPU.
     *
     * @return Una cadena que describe la CPU.
     */
    String getDescription();

    /**
     * Obtiene el precio de la CPU.
     * @return El precio de la CPU.
     */
    double getPrecio();
}
