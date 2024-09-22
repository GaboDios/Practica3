public interface PCBuilder {
    void addCPU(CPU cpu);
    void addGPU(GPU gpu);
    void addRAM(RAM ram);
    void addDiscoDuro(DiscoDuro discoDuro);
    void addFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion);
    void addPlacaBase(PlacaBase placaBase);
    PC build(); // Método que retorna la PC construida
}
