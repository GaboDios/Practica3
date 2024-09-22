/**
 * Clase que implementa el patrn Builder para construir una PC de 
 * tipo Gaming. Esta clase permite agregar componentes a la PC y 
 * construirla paso a paso.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class GamingPCBuilder implements PCBuilder {
    private PC pc;

    /**
     * Constructor que inicializa una nueva PC vacía.
     */
    public GamingPCBuilder() {
        this.pc = new PC(); // Inicializamos una nueva PC vacía
    }

    @Override
    public void addCPU(CPU cpu) {
        pc.setCPU(cpu);
    }

    @Override
    public void addGPU(GPU gpu) {
        pc.setGPU(gpu);
    }

    @Override
    public void addRAM(RAM ram) {
        pc.setRAM(ram);
    }

    @Override
    public void addDiscoDuro(DiscoDuro discoDuro) {
        pc.setDiscoDuro(discoDuro);
    }

    @Override
    public void addFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        pc.setFuenteAlimentacion(fuenteAlimentacion);
    }

    @Override
    public void addPlacaBase(PlacaBase placaBase) {
        pc.setPlacaBase(placaBase);
    }

    /**
     * Construye y devuelve la PC completamente configurada.
     * @return La PC construida.
     */
    @Override
    public PC build() {
        return pc; // Retorna la PC completamente construida
    }
}
