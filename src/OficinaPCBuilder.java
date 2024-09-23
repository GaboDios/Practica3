/**
 * Clase que implementa el patrón Builder para construir una PC de oficina.
 * Permite la adición de componentes como CPU, GPU, RAM, disco duro, fuente de alimentación
 * y placa base a una instancia de PC, utilizando una fábrica de componentes.
 *
 * Esta clase sigue el patrón de diseño Builder, donde cada paso en el proceso de
 * construcción se realiza a través de métodos específicos que ensamblan componentes
 * de gama media, adecuados para una PC de oficina.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class OficinaPCBuilder extends PCBuilder {

    /**
     * Constructor que inicializa el builder para construir una PC de oficina.
     *
     * @param factory La fábrica de componentes que se utilizará para crear los componentes de la PC.
     */
    public OficinaPCBuilder(ComponenteFactory factory) {
        super(factory);
    }

    /**
     * Construye una CPU de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar la CPU de gama media.
     */
    @Override
    public void construirCPU() {
        pc.setCPU(factory.crearCPU(2));  // Usa la fábrica para crear una CPU de gama media
    }

    /**
     * Construye una GPU de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar la GPU de gama media.
     */
    @Override
    public void construirGPU() {
        pc.setGPU(factory.crearGPU(2));  // Usa la fábrica para crear una GPU de gama media
    }

    /**
     * Construye una RAM de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar la RAM de gama media.
     */
    @Override
    public void construirRAM() {
        pc.setRAM(factory.crearRAM(2));  // Usa la fábrica para crear una RAM de gama media
    }

    /**
     * Construye un disco duro de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar el disco duro de gama media.
     */
    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro(factory.crearDiscoDuro(2));  // Usa la fábrica para crear un Disco Duro de gama media
    }

    /**
     * Construye una fuente de alimentación de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar la fuente de alimentación de gama media.
     */
    @Override
    public void construirFuenteAlimentacion() {
        pc.setFuenteAlimentacion(factory.crearFuenteAlimentacion(2));  // Usa la fábrica para crear una fuente de gama media
    }

    /**
     * Construye una placa base de gama media para la PC de oficina utilizando la fábrica de componentes.
     * El índice 2 se utiliza para seleccionar la placa base de gama media.
     */
    @Override
    public void construirPlacaBase() {
        pc.setPlacaBase(factory.crearPlacaBase(2));  // Usa la fábrica para crear una placa base de gama media
    }
}
