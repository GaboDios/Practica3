/**
 * Clase que implementa el patrn Builder para construir una PC de
 * tipo Gaming. Esta clase permite agregar componentes a la PC y
 * construirla paso a paso.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class GamingPCBuilder extends PCBuilder {

    /**
     * Constructor que inicializa una nueva PC vacía utilizando un factory
     * de componentes. La PC resultante será de tipo Gaming, con componentes
     * de gama alta.
     *
     * @param factory La fábrica de componentes que será utilizada para crear los componentes de la PC.
     */
    public GamingPCBuilder(ComponenteFactory factory) {
        super(factory);
    }

    /**
     * Construye una CPU de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar la CPU de gama alta.
     */
    @Override
    public void construirCPU() {
        pc.setCPU(factory.crearCPU(1));
    }

    /**
     * Construye una GPU de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar la GPU de gama alta.
     */
    @Override
    public void construirGPU() {
        pc.setGPU(factory.crearGPU(1));
    }

    /**
     * Construye una RAM de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar la RAM de gama alta.
     */
    @Override
    public void construirRAM() {
        pc.setRAM(factory.crearRAM(1));
    }

    /**
     * Construye un disco duro de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar el disco duro de gama alta.
     */
    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro(factory.crearDiscoDuro(1));
    }

    /**
     * Construye una fuente de alimentación de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar la fuente de alimentación de gama alta.
     */
    @Override
    public void construirFuenteAlimentacion() {
        pc.setFuenteAlimentacion(factory.crearFuenteAlimentacion(1));
    }

    /**
     * Construye una placa base de gama alta para la PC utilizando la fábrica de componentes.
     * El índice 1 se utiliza para seleccionar la placa base de gama alta.
     */
    @Override
    public void construirPlacaBase() {
        pc.setPlacaBase(factory.crearPlacaBase(1));
    }
}
