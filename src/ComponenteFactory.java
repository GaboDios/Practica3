public interface ComponenteFactory {
    CPU crearCPU(int index);
    GPU crearGPU(int index);
    RAM crearRAM(int index);
    DiscoDuro crearDiscoDuro(int index);
    FuenteAlimentacion crearFuenteAlimentacion(int index);
    PlacaBase crearPlacaBase(int index);
}
