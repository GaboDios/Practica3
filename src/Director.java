public class Director {
    private PCBuilder builder;

    public Director(PCBuilder builder) {
        this.builder = builder;
    }

    // Método para construir una PC completa
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
