/**
 * Interfaz que representa un componente de hardware.
 * Define los métodos básicos que deben implementar todos los componentes.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface Componente {
    /**
     * Obtiene el nombre del componente.
     * @return El nombre del componente.
     */
    String getNombre();

    /**
     * Obtiene el precio del componente.
     * @return El precio del componente.
     */
    double getPrecio();

    /**
     * Obtiene la marca del componente.
     * @return La marca del componente.
     */
    String getMarca();

    /**
     * Obtiene el tipo de componente.
     * @return El tipo de componente.
     */
    String getTipoComponente();

    /**
     * Obtiene una descripcion completa del componente.
     * @return Una cadena con la descripcion del componente.
     */
    String getDescription();

    /**
     * Obtiene una descripcion completa de la gama del componente.
     * @return Una cadena con la descripcion de la gama del componente.
     */
    String getGama();
}
