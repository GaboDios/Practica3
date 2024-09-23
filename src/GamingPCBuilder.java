public class GamingPCBuilder extends PCBuilder {

    public GamingPCBuilder(ComponenteFactory factory) {
        super(factory);
    }

    @Override
    public void construirCPU() {
        pc.setCPU(factory.crearCPU(1));  // Usa la fábrica para crear una CPU de gama alta
    }

    @Override
    public void construirGPU() {
        pc.setGPU(factory.crearGPU(1));  // Usa la fábrica para crear una GPU de gama alta
    }

    @Override
    public void construirRAM() {
        pc.setRAM(factory.crearRAM(1));  // Usa la fábrica para crear una RAM de gama alta
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro(factory.crearDiscoDuro(1));  // Usa la fábrica para crear un Disco Duro de gama alta
    }

    @Override
    public void construirFuenteAlimentacion() {
        pc.setFuenteAlimentacion(factory.crearFuenteAlimentacion(1));  // Usa la fábrica para crear una fuente de gama alta
    }

    @Override
    public void construirPlacaBase() {
        pc.setPlacaBase(factory.crearPlacaBase(1));  // Usa la fábrica para crear una placa base de gama alta
    }
}
