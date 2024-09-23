public abstract class PCBuilder {
    protected PC pc;
    protected ComponenteFactory factory; // Fábrica de componentes (AMD o Intel)

    public PCBuilder(ComponenteFactory factory) {
        this.factory = factory;
        this.pc = new PC();
    }

    public PC getPC() {
        return pc;
    }

    public abstract void construirCPU();
    public abstract void construirGPU();
    public abstract void construirRAM();
    public abstract void construirDiscoDuro();
    public abstract void construirFuenteAlimentacion();
    public abstract void construirPlacaBase();
}
