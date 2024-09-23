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
    private String compatibleSocket;
    private String gama;

    /**
     * Constructor que inicializa una placa base con los detalles proporcionados.
     *
     * @param nombre el nombre de la placa base
     * @param precio el precio de la placa base
     * @param marca la marca de la placa base
     * @param formato el formato de la placa base
     * @param chipset el chipset de la placa base
     * @param compatibleSocket el socket compatible con la placa base
     * @param gama la gama de la placa base
     */
    public IntelPlacaBase(String nombre, double precio, String marca, String formato, String chipset, String compatibleSocket, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.formato = formato;
        this.chipset = chipset;
        this.compatibleSocket = compatibleSocket;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo de la placa base.
     *
     * @return El nombre de la placa base.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la placa base.
     *
     * @return El precio de la placa base en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la placa base.
     *
     * @return La marca de la placa base (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "Placa Base".
     *
     * @return El tipo de componente (siempre "Placa Base").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Retorna el socket compatible con la placa base.
     *
     * @return El socket compatible (ej. LGA1200, AM4).
     */
    @Override
    public String getCompatibleSocket() {
        return compatibleSocket;  // Retorna el socket compatible (ej: AM4)
    }

    /**
     * Proporciona una descripción completa de la placa base, que incluye el nombre,
     * la marca, el formato, el chipset, el socket compatible y el precio.
     *
     * @return Una cadena con la descripción detallada de la placa base.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Formato: " + formato + " - Chipset: " + chipset + " - Socket: " + compatibleSocket + " - Precio: $" + precio;
    }

    /**
     * Retorna la gama de la placa base (alta, media, baja).
     *
     * @return La gama de la placa base.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
