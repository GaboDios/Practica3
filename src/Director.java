/**
 * Clase que actua como director para construir una PC utilizando un builder.
 * Utiliza una instancia de PCBuilder para añadir componentes y construir una PC completa.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class Director {
    private PCBuilder builder;

    /**
     * Constructor para crear un director.
     * @param builder El builder que se utilizará para construir la PC.
     */
    public Director(PCBuilder builder) {
        this.builder = builder;
    }

    /**
     * Metodo para construir una PC completa con los componentes especificados.
     * @param cpu La CPU que se añadira a la PC.
     * @param gpu La GPU que se añadira a la PC.
     * @param ram La RAM que se añadira a la PC.
     * @param discoDuro El disco duro que se añadira a la PC.
     * @param fuenteAlimentacion La fuente de alimentacion que se añadira a la PC.
     * @param placaBase La placa base que se añadira a la PC.
     * @return La PC construida.
     */
    public PC construirPC(CPU cpu, GPU gpu, RAM ram, DiscoDuro discoDuro, FuenteAlimentacion fuenteAlimentacion, PlacaBase placaBase) {
        builder.addCPU(cpu);
        builder.addGPU(gpu);
        builder.addRAM(ram);
        builder.addDiscoDuro(discoDuro);
        builder.addFuenteAlimentacion(fuenteAlimentacion);
        builder.addPlacaBase(placaBase);
        return builder.build(); // Retorna la PC construida
    }
}
