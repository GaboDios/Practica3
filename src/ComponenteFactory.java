import java.util.List;

public interface ComponenteFactory {
    // Métodos existentes para crear componentes
    CPU crearCPU(int index);
    GPU crearGPU(int index);
    RAM crearRAM(int index);
    DiscoDuro crearDiscoDuro(int index);
    FuenteAlimentacion crearFuenteAlimentacion(int index);
    PlacaBase crearPlacaBase(int index);

    // Nuevos métodos para obtener componentes filtrados por gama
    List<CPU> getCPUsPorGama(String gama);
    List<GPU> getGPUsPorGama(String gama);
    List<RAM> getRAMsPorGama(String gama);
    List<DiscoDuro> getDiscosDurosPorGama(String gama);
    List<FuenteAlimentacion> getFuentesPorGama(String gama);
    List<PlacaBase> getPlacasBasePorGama(String gama);
}
