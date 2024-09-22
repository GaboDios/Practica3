/**
 * Clase que representa una PC ensamblada con varios componentes.
 * Esta clase permite establecer y almacenar los diferentes componentes
 * de una computadora, como CPU, GPU, RAM, disco duro, fuente de alimentacion
 * y placa base.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class PC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;

    // Métodos setters para cada componente

    /**
     * Establece la CPU de la PC.
     * @param cpu La CPU a establecer
     */
    public void setCPU(CPU cpu) { this.cpu = cpu; }

    /**
     * Establece la GPU de la PC.
     * @param gpu La GPU a establecer
     */
    public void setGPU(GPU gpu) { this.gpu = gpu; }

    /**
     * Establece la RAM de la PC.
     * @param ram La RAM a establecer
     */
    public void setRAM(RAM ram) { this.ram = ram; }

    /**
     * Establece el disco duro de la PC.
     * @param discoDuro El disco duro a establecer
     */
    public void setDiscoDuro(DiscoDuro discoDuro) { this.discoDuro = discoDuro; }

    /**
     * Establece la fuente de alimentacion de la PC.
     * @param fuenteAlimentacion La fuente de alimentacion a establecer
     */
    public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) { this.fuenteAlimentacion = fuenteAlimentacion; }

    /**
     * Establece la placa base de la PC.
     * @param placaBase La placa base a establecer
     */
    public void setPlacaBase(PlacaBase placaBase) { this.placaBase = placaBase; }

    /**
     * Muestra la configuracion actual de la PC.
     * Imprime en consola los detalles de cada componente,
     * indicando si alguno de ellos no ha sido establecido.
     */
    public void mostrarConfiguracion() {
        System.out.println("Configuración del equipo:");
        System.out.println("CPU: " + (cpu != null ? cpu.getDescription() : "Sin CPU"));
        System.out.println("GPU: " + (gpu != null ? gpu.getDescription() : "Sin GPU"));
        System.out.println("RAM: " + (ram != null ? ram.getDescription() : "Sin RAM"));
        System.out.println("Disco Duro: " + (discoDuro != null ? discoDuro.getDescription() : "Sin Disco Duro"));
        System.out.println("Fuente de Alimentación: " + (fuenteAlimentacion != null ? fuenteAlimentacion.getDescription() : "Sin Fuente"));
        System.out.println("Placa Base: " + (placaBase != null ? placaBase.getDescription() : "Sin Placa Base"));
    }
}
