/**
 * Interfaz que define los metodos para los componentes de tipo
 * Fuente de Alimentacion en una configuración de PC.
 * Proporciona metodos para obtener la descripcion y el precio
 * de la fuente de alimentacion.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface FuenteAlimentacion {
    /**
     * Obtiene la descripcion completa de la fuente de alimentacion.
     * @return La descripcion de la fuente de alimentacion.
     */
    String getDescription();

    /**
     * Obtiene el precio de la fuente de alimentacion.
     * @return El precio de la fuente de alimentacion.
     */
    double getPrecio();

    /**
     * Obtiene la descripcion de la gama de la fuente de alimentacion.
     * @return La descripcion de la gama de la fuente de alimentacion.
     */
    String getGama();
}
