/**
 * Interfaz que define un factory para la creacion de componentes de hardware.
 * Proporciona metodos para crear diferentes tipos de componentes.
 * @author Gabo, Pedro, Yamil, Isaac (Los Hijos de Korhal)
 */
public interface ComponenteFactory {
    /**
     * Crea una CPU a partir del indice especificado.
     * @param index El indice de la CPU a crear.
     * @return La CPU creada.
     */
    CPU crearCPU(int index);

    /**
     * Crea una GPU a partir delindice especificado.
     * @param index El indice de la GPU a crear.
     * @return La GPU creada.
     */
    GPU crearGPU(int index);

    /**
     * Crea una RAM a partir del indice especificado.
     * @param index El indice de la RAM a crear.
     * @return La RAM creada.
     */
    RAM crearRAM(int index);

    /**
     * Crea un disco duro a partir del indice especificado.
     * @param index El indice del disco duro a crear.
     * @return El disco duro creado.
     */
    DiscoDuro crearDiscoDuro(int index);

    /**
     * Crea una fuente de alimentacion a partir del indice especificado.
     * @param index El indice de la fuente de alimentacion a crear.
     * @return La fuente de alimentacion creada.
     */
    FuenteAlimentacion crearFuenteAlimentacion(int index);

    /**
     * Crea una placa base a partir del indice especificado.
     *
     * @param index El indice de la placa base a crear.
     * @return La placa base creada.
     */
    PlacaBase crearPlacaBase(int index);
}
