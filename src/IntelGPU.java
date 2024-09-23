/**
 * Clase que implementa la interfaz GPU y Componente
 * para representar una tarjeta grafica especifica de la marca Intel.
 * Proporciona informacion sobre el nombre, precio, marca, tipo de memoria
 * y puertos de salida de la GPU.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelGPU implements GPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "GPU";
    private String tipoMemoria;
    private String puertosSalida;
    private String gama;

    /**
     * Constructor que inicializa una tarjeta grafica con los detalles proporcionados.
     *
     * @param nombre el nombre de la GPU
     * @param precio el precio de la GPU
     * @param marca la marca de la GPU
     * @param tipoMemoria el tipo de memoria de la GPu
     * @param puertosSalida los puertos de salida disponibles en la GPU
     * @param gama la gama de la GPU
     */
    public IntelGPU(String nombre, double precio, String marca, String tipoMemoria, String puertosSalida, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipoMemoria = tipoMemoria;
        this.puertosSalida = puertosSalida;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo de la GPU.
     *
     * @return El nombre de la GPU.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la GPU.
     *
     * @return El precio de la GPU en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la GPU.
     *
     * @return La marca de la GPU (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "GPU".
     *
     * @return El tipo de componente (siempre "GPU").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Proporciona una descripción completa de la GPU, que incluye el nombre,
     * la marca, el tipo de memoria, los puertos de salida y el precio.
     *
     * @return Una cadena con la descripción detallada de la GPU.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Tipo Memoria: " + tipoMemoria + " - Puertos: " + puertosSalida + " - Precio: $" + precio;
    }

    /**
     * Retorna la gama de la GPU (alta, media, baja).
     *
     * @return La gama de la GPU.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
