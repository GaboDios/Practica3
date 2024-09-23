/**
 * Clase que representa una placa base AMD.
 * Implementa las interfaces PlacaBase y Componente.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDPlacaBase implements PlacaBase, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Placa Base";
    private String formato;
    private String chipset;
    private String compatibleSocket;
    private String gama;

    /**
     * Constructor para crear una placa base AMD.
     *
     * @param nombre El nombre de la placa base.
     * @param precio El precio de la placa base.
     * @param marca La marca de la placa base.
     * @param formato El formato de la placa base.
     * @param chipset El chipset de la placa base.
     * @param compatibleSocket El socket compatible con la placa base.
     */
    public AMDPlacaBase(String nombre, double precio, String marca, String formato, String chipset, String compatibleSocket, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.formato = formato;
        this.chipset = chipset;
        this.compatibleSocket = compatibleSocket;
        this.gama = gama;
    }

    /**
     * Obtiene el nombre de la placa base.
     *
     * @return El nombre de la placa base.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de la placa base.
     *
     * @return El precio de la placa base.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca de la placa base.
     * @return La marca de la placa base.
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tipo de componente.
     *
     * @return El tipo de componente.
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Obtiene el socket compatible de la placa base.
     * @return El socket compatible.
     */
    @Override
    public String getCompatibleSocket() {
        return compatibleSocket;
    }

    /**
     * Obtiene una descripcin de la placa base.
     * @return Una cadena con la descripcion de la placa base.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Formato: " + formato + " - Chipset: " + chipset + " - Socket: " + compatibleSocket + " - Precio: $" + precio;
    }

    /**
     * Obtiene una descripcin de la gama de la placa base.
     * @return Una cadena con la descripcion de la gama de la placa base.
     */
    @Override
    public  String getGama(){
        return gama;
    }
}
