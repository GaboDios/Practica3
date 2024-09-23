/**
 * Clase que actua como director para construir una PC utilizando un builder.
 * Utiliza una instancia de PCBuilder para añadir componentes y construir una PC completa.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class Director {
    private PCBuilder pcBuilder;

    /**
     * Constructor para crear un director.
     * @param pcBuilder El builder que se utilizará para construir la PC.
     */
    public Director(PCBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    /**
     * Método que inicia el proceso de construcción de una PC.
     * Llama a los métodos del builder para construir los diferentes componentes
     * de la PC, como la CPU, GPU, RAM, disco duro, fuente de alimentación y placa base.
     */
    public void construirPC() {
        pcBuilder.construirCPU();
        pcBuilder.construirGPU();
        pcBuilder.construirRAM();
        pcBuilder.construirDiscoDuro();
        pcBuilder.construirFuenteAlimentacion();
        pcBuilder.construirPlacaBase();
    }

    /**
     * Método que retorna la PC completamente ensamblada.
     *
     * @return La PC que fue construida por el builder.
     */
    public PC getPC() {
        return pcBuilder.getPC();
    }
}
