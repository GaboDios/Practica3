/**
 * Clase que implementa la interfaz PlacaBase y Componente
 * para representar una placa base específica de la marca Intel.
 * Proporciona informacion sobre el nombre, precio, marca, formato,
 * chipset y socket compatible de la placa base.
 * 
 * @author Gabo, Pedro, Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelPlacaBase implements PlacaBase, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Placa Base";
    private String formato;
    private String chipset;
    private String compatibleSocket; // Añadimos el socket compatible

    /**
     * Constructor que inicializa una placa base con los detalles proporcionados.
     *
     * @param nombre el nombre de la placa base
     * @param precio el precio de la placa base
     * @param marca la marca de la placa base
     * @param formato el formato de la placa base
     * @param chipset el chipset de la placa base
     * @param compatibleSocket el socket compatible con la placa base
     */
    public IntelPlacaBase(String nombre, double precio, String marca, String formato, String chipset, String compatibleSocket) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.formato = formato;
        this.chipset = chipset;
        this.compatibleSocket = compatibleSocket; // Inicializamos el socket compatible
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    @Override
    public String getCompatibleSocket() {
        return compatibleSocket;  // Retorna el socket compatible (ej: AM4)
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Formato: " + formato + " - Chipset: " + chipset + " - Socket: " + compatibleSocket + " - Precio: $" + precio;
    }
}
