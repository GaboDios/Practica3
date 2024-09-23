import java.util.List;

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

    /**
     * Obtiene una lista de CPUs filtradas por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de CPUs que pertenecen a la gama especificada.
     */
    List<CPU> getCPUsPorGama(String gama);

    /**
     * Obtiene una lista de GPUs filtradas por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de GPUs que pertenecen a la gama especificada.
     */
    List<GPU> getGPUsPorGama(String gama);

    /**
     * Obtiene una lista de RAMs filtradas por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de RAMs que pertenecen a la gama especificada.
     */
    List<RAM> getRAMsPorGama(String gama);

    /**
     * Obtiene una lista de discos duros filtrados por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de discos duros que pertenecen a la gama especificada.
     */
    List<DiscoDuro> getDiscosDurosPorGama(String gama);

    /**
     * Obtiene una lista de fuentes de alimentación filtradas por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de fuentes de alimentación que pertenecen a la gama especificada.
     */
    List<FuenteAlimentacion> getFuentesPorGama(String gama);

    /**
     * Obtiene una lista de placas base filtradas por la gama especificada.
     *
     * @param gama La gama a filtrar (alta, media, baja).
     * @return Lista de placas base que pertenecen a la gama especificada.
     */
    List<PlacaBase> getPlacasBasePorGama(String gama);
}
