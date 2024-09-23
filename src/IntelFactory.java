import java.util.List;
import java.util.ArrayList;

public class IntelFactory implements ComponenteFactory {
    private List<CPU> cpus = new ArrayList<>();
    private List<GPU> gpus = new ArrayList<>();
    private List<RAM> rams = new ArrayList<>();
    private List<DiscoDuro> discosDuros = new ArrayList<>();
    private List<FuenteAlimentacion> fuentes = new ArrayList<>();
    private List<PlacaBase> placasBases = new ArrayList<>();

    public IntelFactory() {
        // Inicializar con 5 opciones de CPU
        cpus.add(new IntelCPU("Intel Core i9-11900K", 500.0, "Intel", "LGA1200", 3.5, "alta"));
        cpus.add(new IntelCPU("Intel Core i7-11700K", 400.0, "Intel", "LGA1200", 3.6, "media"));
        cpus.add(new IntelCPU("Intel Core i5-11600K", 300.0, "Intel", "LGA1200", 3.9, "media"));
        cpus.add(new IntelCPU("Intel Core i5-10400", 180.0, "Intel", "LGA1200", 2.9, "baja"));
        cpus.add(new IntelCPU("Intel Core i3-10100", 120.0, "Intel", "LGA1200", 3.6, "baja"));

        // Inicializar con 5 opciones de GPU (compatibles con Intel y otras plataformas)
        gpus.add(new IntelGPU("NVIDIA GeForce RTX 3080", 800.0, "NVIDIA", "GDDR6X", "HDMI, DisplayPort", "alta"));
        gpus.add(new IntelGPU("NVIDIA GeForce RTX 3070", 600.0, "NVIDIA", "GDDR6X", "HDMI, DisplayPort", "media"));
        gpus.add(new IntelGPU("NVIDIA GeForce GTX 1660 Super", 300.0, "NVIDIA", "GDDR6", "HDMI, DisplayPort", "media"));
        gpus.add(new IntelGPU("NVIDIA GeForce RTX 2060", 350.0, "NVIDIA", "GDDR6", "HDMI, DisplayPort", "media"));
        gpus.add(new IntelGPU("NVIDIA GeForce GTX 1650", 200.0, "NVIDIA", "GDDR6", "HDMI, DisplayPort", "baja"));

        // Inicializar con 5 opciones de RAM
        rams.add(new IntelRAM("Intel RAM DDR5", 300.0, "Intel", 32, "DDR5", "alta"));
        rams.add(new IntelRAM("Intel RAM DDR4", 150.0, "Intel", 16, "DDR4", "media"));
        rams.add(new IntelRAM("Intel RAM DDR4", 120.0, "Intel", 8, "DDR4", "baja"));
        rams.add(new IntelRAM("Intel RAM DDR4", 80.0, "Intel", 4, "DDR4", "baja"));
        rams.add(new IntelRAM("Intel RAM DDR5", 250.0, "Intel", 16, "DDR5", "media"));

        // Inicializar con 6 opciones de Disco Duro
        discosDuros.add(new IntelDiscoDuro("Samsung 980 PRO", 250.0, "Samsung", 2000, "SSD NVMe", "alta"));
        discosDuros.add(new IntelDiscoDuro("Samsung 970 EVO", 150.0, "Samsung", 1000, "SSD", "media"));
        discosDuros.add(new IntelDiscoDuro("Seagate Barracuda", 80.0, "Seagate", 2000, "HDD", "baja"));
        discosDuros.add(new IntelDiscoDuro("Western Digital Blue", 60.0, "Western Digital", 1000, "HDD", "baja"));
        discosDuros.add(new IntelDiscoDuro("Crucial MX500", 120.0, "Crucial", 500, "SSD", "media"));
        discosDuros.add(new IntelDiscoDuro("Kingston A400", 45.0, "Kingston", 240, "SSD", "baja"));

        // Inicializar con 5 opciones de Fuentes de Alimentacion
        fuentes.add(new IntelFuenteAlimentacion("Corsair RM850x", 120.0, "Corsair", 850, "80 Plus Gold", "alta"));
        fuentes.add(new IntelFuenteAlimentacion("EVGA SuperNOVA 750 G5", 110.0, "EVGA", 750, "80 Plus Gold", "media"));
        fuentes.add(new IntelFuenteAlimentacion("Seasonic Focus GX-650", 90.0, "Seasonic", 650, "80 Plus Gold", "media"));
        fuentes.add(new IntelFuenteAlimentacion("Cooler Master MWE Gold 550", 75.0, "Cooler Master", 550, "80 Plus Gold", "baja"));
        fuentes.add(new IntelFuenteAlimentacion("Thermaltake Smart 500W", 50.0, "Thermaltake", 500, "80 Plus", "baja"));

        // Inicializar con 5 opciones de Placas Base (compatibles con CPUs Intel)
        placasBases.add(new IntelPlacaBase("ASUS ROG Strix Z490-E", 280.0, "ASUS", "ATX", "Z490", "LGA1200", "alta"));
        placasBases.add(new IntelPlacaBase("MSI MPG Z490 Gaming Edge", 200.0, "MSI", "ATX", "Z490", "LGA1200", "media"));
        placasBases.add(new IntelPlacaBase("Gigabyte Z590 AORUS Elite", 240.0, "Gigabyte", "ATX", "Z590", "LGA1200", "media"));
        placasBases.add(new IntelPlacaBase("ASRock B460M Pro4", 100.0, "ASRock", "Micro-ATX", "B460", "LGA1200", "baja"));
        placasBases.add(new IntelPlacaBase("ASUS Prime Z490-P", 160.0, "ASUS", "ATX", "Z490", "LGA1200", "media"));

    }

    @Override
    public CPU crearCPU(int index) {
        if (index >= 0 && index < cpus.size()) {
            return cpus.get(index);
        }
        return cpus.get(0);  // Retorna la primera opción si el índice es inválido
    }

    @Override
    public GPU crearGPU(int index) {
        if (index >= 0 && index < gpus.size()) {
            return gpus.get(index);
        }
        return gpus.get(0);
    }

    @Override
    public RAM crearRAM(int index) {
        if (index >= 0 && index < rams.size()) {
            return rams.get(index);
        }
        return rams.get(0);
    }

    @Override
    public DiscoDuro crearDiscoDuro(int index) {
        if (index >= 0 && index < discosDuros.size()) {
            return discosDuros.get(index);
        }
        return discosDuros.get(0);
    }

    @Override
    public FuenteAlimentacion crearFuenteAlimentacion(int index) {
        if (index >= 0 && index < fuentes.size()) {
            return fuentes.get(index);
        }
        return fuentes.get(0);
    }

    @Override
    public PlacaBase crearPlacaBase(int index) {
        if (index >= 0 && index < placasBases.size()) {
            return placasBases.get(index);
        }
        return placasBases.get(0);
    }

    // Métodos para filtrar componentes por gama
    @Override
    public List<CPU> getCPUsPorGama(String gama) {
        List<CPU> resultado = new ArrayList<>();
        for (CPU cpu : cpus) {
            if (cpu.getGama().equalsIgnoreCase(gama)) {
                resultado.add(cpu);
            }
        }
        return resultado;
    }

    @Override
    public List<GPU> getGPUsPorGama(String gama) {
        List<GPU> resultado = new ArrayList<>();
        for (GPU gpu : gpus) {
            if (gpu.getGama().equalsIgnoreCase(gama)) {
                resultado.add(gpu);
            }
        }
        return resultado;
    }

    @Override
    public List<RAM> getRAMsPorGama(String gama) {
        List<RAM> resultado = new ArrayList<>();
        for (RAM ram : rams) {
            if (ram.getGama().equalsIgnoreCase(gama)) {
                resultado.add(ram);
            }
        }
        return resultado;
    }

    @Override
    public List<DiscoDuro> getDiscosDurosPorGama(String gama) {
        List<DiscoDuro> resultado = new ArrayList<>();
        for (DiscoDuro dd : discosDuros) {
            if (dd.getGama().equalsIgnoreCase(gama)) {
                resultado.add(dd);
            }
        }
        return resultado;
    }

    @Override
    public List<FuenteAlimentacion> getFuentesPorGama(String gama) {
        List<FuenteAlimentacion> resultado = new ArrayList<>();
        for (FuenteAlimentacion fuente : fuentes) {
            if (fuente.getGama().equalsIgnoreCase(gama)) {
                resultado.add(fuente);
            }
        }
        return resultado;
    }

    @Override
    public List<PlacaBase> getPlacasBasePorGama(String gama) {
        List<PlacaBase> resultado = new ArrayList<>();
        for (PlacaBase pb : placasBases) {
            if (pb.getGama().equalsIgnoreCase(gama)) {
                resultado.add(pb);
            }
        }
        return resultado;
    }
}
