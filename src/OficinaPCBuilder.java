/**
 * Clase que implementa el patrOn Builder para construir una PC de oficina.
 * Permite la adiciOn de componentes como CPU, GPU, RAM, disco duro, fuente de alimentacion
 * y placa base a una instancia de PC.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class OficinaPCBuilder implements PCBuilder {
    private PC pc;

    /**
     * Constructor que inicializa una nueva PC vacía.
     */
    public OficinaPCBuilder() {
        this.pc = new PC(); // Inicializamos una nueva PC vacía
    }

    /**
     * Agrega una CPU a la PC en construccion.
     *
     * @param cpu La CPU a agregar
     */
    @Override
    public void addCPU(CPU cpu) {
        pc.setCPU(cpu);
    }

    /**
     * Agrega una GPU a la PC en construccion.
     *
     * @param gpu La GPU a agregar
     */
    @Override
    public void addGPU(GPU gpu) {
        pc.setGPU(gpu);
    }

    /**
     * Agrega RAM a la PC en construccion.
     * @param ram La RAM a agregar
     */
    @Override
    public void addRAM(RAM ram) {
        pc.setRAM(ram);
    }

    /**
     * Agrega un disco duro a la PC en construccion.
     * @param discoDuro El disco duro a agregar
     */
    @Override
    public void addDiscoDuro(DiscoDuro discoDuro) {
        pc.setDiscoDuro(discoDuro);
    }

    /**
     * Agrega una fuente de alimentacion a la PC en construccion.
     * @param fuenteAlimentacion La fuente de alimentacion a agregar
     */
    @Override
    public void addFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        pc.setFuenteAlimentacion(fuenteAlimentacion);
    }

    /**
     * Agrega una placa base a la PC en construccion.
     * @param placaBase La placa base a agregar
     */
    @Override
    public void addPlacaBase(PlacaBase placaBase) {
        pc.setPlacaBase(placaBase);
    }

    /**
     * Construye y retorna la PC completamente configurada.
     * @return La PC construida
     */
    @Override
    public PC build() {
        return pc; // Retorna la PC completamente construida
    }
}
