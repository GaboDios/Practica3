/**
 * Clase que representa una CPU de la marca Intel. Implementa la
 * interfaz CPU y Componente, proporcionando informacion sobre
 * el nombre, precio, marca, tipo de componente, socket y
 * frecuencia de la CPU.
 *
 * @author Gabo, Pedro, Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelCPU implements CPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "CPU";
    private String socket;
    private double frecuencia;  // Frecuencia específica de la CPU
    private String gama;

    /**
     * Constructor que inicializa los atributos de la CPU Intel.
     * @param nombre El nombre del modelo de la CPU.
     * @param precio El precio de la CPU.
     * @param marca La marca de la CPU.
     * @param socket El tipo de socket de la CPU.
     * @param frecuencia La frecuencia de operacion de la CPU.
     * @param gama La gama de la CPU.
     */
    public IntelCPU(String nombre, double precio, String marca, String socket, double frecuencia, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.socket = socket;
        this.frecuencia = frecuencia;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo de la CPU.
     *
     * @return El nombre de la CPU.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la CPU.
     *
     * @return El precio de la CPU en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la CPU.
     *
     * @return La marca de la CPU (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "CPU".
     *
     * @return El tipo de componente (siempre "CPU").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Retorna el tipo de socket que utiliza la CPU.
     *
     * @return El tipo de socket compatible con la CPU.
     */
    @Override
    public String getSocketType() {
        return socket;
    }

    /**
     * Proporciona una descripción completa de la CPU, que incluye el nombre,
     * la marca, la frecuencia de operación y el precio.
     *
     * @return Una cadena con la descripción detallada de la CPU.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Frecuencia: " + frecuencia + " GHz - Precio: $" + precio;
    }

    /**
     * Retorna la gama de la CPU (alta, media, baja).
     *
     * @return La gama de la CPU.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
