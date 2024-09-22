import java.util.List;
import java.util.ArrayList;

/**
 * Clase que representa una fábrica de componentes AMD.
 * Implementa la interfaz ComponenteFactory.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDFactory implements ComponenteFactory {
    private List<CPU> cpus = new ArrayList<>();
    private List<GPU> gpus = new ArrayList<>();
    private List<RAM> rams = new ArrayList<>();
    private List<DiscoDuro> discosDuros = new ArrayList<>();
    private List<FuenteAlimentacion> fuentes = new ArrayList<>();
    private List<PlacaBase> placasBases = new ArrayList<>();

    /**
     * Constructor que inicializa la fábrica con opciones predeterminadas de componentes AMD.
     */
    public AMDFactory() {
        // Inicializar con 5 opciones de CPU
        cpus.add(new AMDCPU("AMD Ryzen 9", 450.0, "AMD", "AM4", 3.7));
        cpus.add(new AMDCPU("AMD Ryzen 7", 350.0, "AMD", "AM4", 3.2));
        cpus.add(new AMDCPU("AMD Ryzen 5", 250.0, "AMD", "AM4", 3.0));
        cpus.add(new AMDCPU("AMD Ryzen 3", 150.0, "AMD", "AM4", 2.8));
        cpus.add(new AMDCPU("AMD Threadripper", 1000.0, "AMD", "TRX4", 4.0));

        // Inicializar con 5 opciones de GPU
        gpus.add(new AMDGPU("Radeon RX 6900 XT", 1000.0, "AMD", "GDDR6", "HDMI, DisplayPort"));
        gpus.add(new AMDGPU("Radeon RX 6800 XT", 900.0, "AMD", "GDDR6", "HDMI, DisplayPort"));
        gpus.add(new AMDGPU("Radeon RX 6700 XT", 700.0, "AMD", "GDDR6", "HDMI, DisplayPort"));
        gpus.add(new AMDGPU("Radeon RX 6600 XT", 600.0, "AMD", "GDDR6", "HDMI, DisplayPort"));
        gpus.add(new AMDGPU("Radeon RX 6500 XT", 400.0, "AMD", "GDDR6", "HDMI, DisplayPort"));

        // Inicializar con 5 opciones de RAM
        rams.add(new AMDRAM("AMD RAM DDR4", 150.0, "AMD", 16, "DDR4"));
        rams.add(new AMDRAM("AMD RAM DDR4", 120.0, "AMD", 8, "DDR4"));
        rams.add(new AMDRAM("AMD RAM DDR5", 300.0, "AMD", 32, "DDR5"));
        rams.add(new AMDRAM("AMD RAM DDR4", 80.0, "AMD", 4, "DDR4"));
        rams.add(new AMDRAM("AMD RAM DDR5", 250.0, "AMD", 16, "DDR5"));

        // Inicializar con 5 opciones de DD
        discosDuros.add(new AMDDiscoDuro("Samsung 970 EVO", 150.0, "Samsung", 1000, "SSD"));
        discosDuros.add(new AMDDiscoDuro("Seagate Barracuda", 80.0, "Seagate", 2000, "HDD"));
        discosDuros.add(new AMDDiscoDuro("Western Digital Blue", 60.0, "Western Digital", 1000, "HDD"));
        discosDuros.add(new AMDDiscoDuro("Crucial MX500", 120.0, "Crucial", 500, "SSD"));
        discosDuros.add(new AMDDiscoDuro("Kingston A400", 45.0, "Kingston", 240, "SSD"));

        // Inicializar con 5 opciones de Fuentes de Alimentacion
        fuentes.add(new AMDFuenteAlimentacion("Corsair RM850x", 120.0, "Corsair", 850, "80 Plus Gold"));
        fuentes.add(new AMDFuenteAlimentacion("EVGA SuperNOVA 750 G5", 110.0, "EVGA", 750, "80 Plus Gold"));
        fuentes.add(new AMDFuenteAlimentacion("Seasonic Focus GX-650", 90.0, "Seasonic", 650, "80 Plus Gold"));
        fuentes.add(new AMDFuenteAlimentacion("Cooler Master MWE Gold 550", 75.0, "Cooler Master", 550, "80 Plus Gold"));
        fuentes.add(new AMDFuenteAlimentacion("Thermaltake Smart 500W", 50.0, "Thermaltake", 500, "80 Plus"));

        // Inicializar con 5 opciones de Placas Base
        placasBases.add(new AMDPlacaBase("ASUS ROG Strix X570-E", 300.0, "ASUS", "ATX", "X570", "AM4"));
        placasBases.add(new AMDPlacaBase("MSI MAG B550 Tomahawk", 180.0, "MSI", "ATX", "B550", "AM4"));
        placasBases.add(new AMDPlacaBase("Gigabyte AORUS X570 Elite", 200.0, "Gigabyte", "ATX", "X570", "AM4"));
        placasBases.add(new AMDPlacaBase("ASRock B450M Steel Legend", 100.0, "ASRock", "Micro-ATX", "B450", "AM4"));
        placasBases.add(new AMDPlacaBase("ASUS TUF Gaming B550-PLUS", 160.0, "ASUS", "ATX", "B550", "AM4"));
    }

    /**
     * Crea una CPU a partir del índice especificado.
     *
     * @param index El índice de la CPU a crear.
     * @return La CPU correspondiente al índice, o la primera opción si el índice es inválido.
     */
    @Override
    public CPU crearCPU(int index) {
        if (index >= 0 && index < cpus.size()) {
            return cpus.get(index);
        }
        return cpus.get(0);  // Retorna la primera opción si el índice es inválido
    }

    /**
     * Crea una GPU a partir del índice especificado.
     *
     * @param index El índice de la GPU a crear.
     * @return La GPU correspondiente al índice, o la primera opción si el índice es inválido.
     */
    @Override
    public GPU crearGPU(int index) {
        if (index >= 0 && index < gpus.size()) {
            return gpus.get(index);
        }
        return gpus.get(0);
    }

    /**
     * Crea una RAM a partir del índice especificado.
     *
     * @param index El índice de la RAM a crear.
     * @return La RAM correspondiente al índice, o la primera opción si el índice es inválido.
     */
    @Override
    public RAM crearRAM(int index) {
        if (index >= 0 && index < rams.size()) {
            return rams.get(index);
        }
        return rams.get(0);
    }

    /**
     * Crea un disco duro a partir del índice especificado.
     *
     * @param index El índice del disco duro a crear.
     * @return El disco duro correspondiente al índice, o el primer opción si el índice es inválido.
     */
    @Override
    public DiscoDuro crearDiscoDuro(int index) {
        if (index >= 0 && index < discosDuros.size()) {
            return discosDuros.get(index);
        }
        return discosDuros.get(0);
    }

    /**
     * Crea una fuente de alimentación a partir del índice especificado.
     *
     * @param index El índice de la fuente de alimentación a crear.
     * @return La fuente de alimentación correspondiente al índice, o la primera opción si el índice es inválido.
     */
    @Override
    public FuenteAlimentacion crearFuenteAlimentacion(int index) {
        if (index >= 0 && index < fuentes.size()) {
            return fuentes.get(index);
        }
        return fuentes.get(0);
    }

    /**
     * Crea una placa base a partir del índice especificado.
     *
     * @param index El índice de la placa base a crear.
     * @return La placa base correspondiente al índice, o la primera opción si el índice es inválido.
     */
    @Override
    public PlacaBase crearPlacaBase(int index) {
        if (index >= 0 && index < placasBases.size()) {
            return placasBases.get(index);
        }
        return placasBases.get(0);
    }
}
