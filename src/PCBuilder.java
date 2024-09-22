/**
 * Interfaz que define como construir una PC.
 * Esta interfaz permite agregar diferentes componentes a una PC
 * y construir el objeto final.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface PCBuilder {
    /**
     * Agrega una CPU a la PC.
     * @param cpu La CPU a agregar
     */
    void addCPU(CPU cpu);

    /**
     * Agrega una GPU a la PC.
     * @param gpu La GPU a agregar
     */
    void addGPU(GPU gpu);

    /**
     * Agrega una RAM a la PC.
     * @param ram La RAM a agregar
     */
    void addRAM(RAM ram);

    /**
     * Agrega un disco duro a la PC.
     * @param discoDuro El disco duro a agregar
     */
    void addDiscoDuro(DiscoDuro discoDuro);

    /**
     * Agrega una fuente de alimentacion a la PC.
     * @param fuenteAlimentacion La fuente de alimentacion a agregar
     */
    void addFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion);

    /**
     * Agrega una placa base a la PC.
     * @param placaBase La placa base a agregar
     */
    void addPlacaBase(PlacaBase placaBase);

    /**
     * Construye y retorna la PC final.
     * @return La PC construida
     */
    PC build(); // Método que retorna la PC construida
}
