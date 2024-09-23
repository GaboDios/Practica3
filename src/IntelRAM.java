/**
 * Clase que implementa la interfaz RAM y Componente
 * para representar un modulo de RAM específico de la marca Intel.
 * Proporciona información sobre el nombre, precio, marca,
 * capacidad y tipo de memoria del modulo de RAM.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelRAM implements RAM, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "RAM";
    private int capacidad; // Capacidad de RAM en GB
    private String tipoMemoria; // DDR4, DDR5, etc.
    private String gama;

    /**
     * Constructor que inicializa un modulo de RAM con los detalles proporcionados.
     * @param nombre el nombre del modulo de RAM
     * @param precio el precio del modulo de RAM
     * @param marca la marca del modulo de RAM
     * @param capacidad la capacidad de RAM
     * @param tipoMemoria el tipo de memoria
     * @param gama la gama de la RAM
     */
    public IntelRAM(String nombre, double precio, String marca, int capacidad, String tipoMemoria, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoMemoria = tipoMemoria;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo de RAM.
     *
     * @return El nombre del módulo de RAM.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio del módulo de RAM.
     *
     * @return El precio del módulo de RAM en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca del módulo de RAM.
     *
     * @return La marca del módulo de RAM (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "RAM".
     *
     * @return El tipo de componente (siempre "RAM").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Proporciona una descripción completa del módulo de RAM, que incluye el nombre,
     * la marca, la capacidad, el tipo de memoria y el precio.
     *
     * @return Una cadena con la descripción detallada del módulo de RAM.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoMemoria + " - Precio: $" + precio;
    }

    /**
     * Retorna la gama del módulo de RAM (alta, media, baja).
     *
     * @return La gama del módulo de RAM.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
