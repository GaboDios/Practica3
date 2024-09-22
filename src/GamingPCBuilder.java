public class GamingPCBuilder implements PCBuilder {
    private PC pc;

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

    @Override
    public PC build() {
        return pc; // Retorna la PC completamente construida
    }
}
