public class PC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;

    // Métodos setters para cada componente
    public void setCPU(CPU cpu) { this.cpu = cpu; }
    public void setGPU(GPU gpu) { this.gpu = gpu; }
    public void setRAM(RAM ram) { this.ram = ram; }
    public void setDiscoDuro(DiscoDuro discoDuro) { this.discoDuro = discoDuro; }
    public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) { this.fuenteAlimentacion = fuenteAlimentacion; }
    public void setPlacaBase(PlacaBase placaBase) { this.placaBase = placaBase; }

    // Método para mostrar la configuración final
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
