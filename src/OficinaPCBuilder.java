public class OficinaPCBuilder extends PCBuilder {

    public OficinaPCBuilder(ComponenteFactory factory) {
        super(factory);
    }

    @Override
    public void construirCPU() {
        pc.setCPU(factory.crearCPU(2));  // Usa la fábrica para crear una CPU de gama media
    }

    @Override
    public void construirGPU() {
        pc.setGPU(factory.crearGPU(2));  // Usa la fábrica para crear una GPU de gama media
    }

    @Override
    public void construirRAM() {
        pc.setRAM(factory.crearRAM(2));  // Usa la fábrica para crear una RAM de gama media
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro(factory.crearDiscoDuro(2));  // Usa la fábrica para crear un Disco Duro de gama media
    }

    @Override
    public void construirFuenteAlimentacion() {
        pc.setFuenteAlimentacion(factory.crearFuenteAlimentacion(2));  // Usa la fábrica para crear una fuente de gama media
    }

    @Override
    public void construirPlacaBase() {
        pc.setPlacaBase(factory.crearPlacaBase(2));  // Usa la fábrica para crear una placa base de gama media
    }
}
