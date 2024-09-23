/**
 * Interfaz que define los metodos para los componentes de tipo
 * GPU en una configuracion de PC. Proporciona metodos para
 * obtener la descripcion y el precio de la GPU.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface GPU {
    /**
     * Obtiene la descripcion completa de la GPU.
     * @return La descripcion de la GPU.
     */
    String getDescription();

    /**
     * Obtiene el precio de la GPU.
     * @return El precio de la GPU.
     */
    double getPrecio();

    /**
     * Obtiene la descripcion de la gama de la GPU.
     * @return La descripcion de la gama de la GPU.
     */
    String getGama();
}
