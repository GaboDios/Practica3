public class Director {
    private PCBuilder pcBuilder;

    public Director(PCBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    public void construirPC() {
        pcBuilder.construirCPU();
        pcBuilder.construirGPU();
        pcBuilder.construirRAM();
        pcBuilder.construirDiscoDuro();
        pcBuilder.construirFuenteAlimentacion();
        pcBuilder.construirPlacaBase();
    }

    public PC getPC() {
        return pcBuilder.getPC();
    }
}
