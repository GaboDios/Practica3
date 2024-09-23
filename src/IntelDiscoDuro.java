/**
 * Clase que representa un disco duro de la marca Intel. Implementa
 * la interfaz DiscoDuro y Componente, proporcionando información
 * sobre el nombre, precio, marca, tipo de componente, capacidad
 * y tipo de almacenamiento del disco duro.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelDiscoDuro implements DiscoDuro, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Disco Duro";
    private int capacidad;
    private String tipoAlmacenamiento; // HDD o SSD
    private String gama;

    /**
     * Constructor que inicializa los atributos del disco duro Intel.
     *
     * @param nombre El nombre del modelo del disco duro.
     * @param precio El precio del disco duro.
     * @param marca La marca del disco duro.
     * @param capacidad La capacidad del disco duro en GB.
     * @param tipoAlmacenamiento El tipo de almacenamiento del disco duro (HDD o SSD).
     * @param gama La gama del disco duro.
     */
    public IntelDiscoDuro(String nombre, double precio, String marca, int capacidad, String tipoAlmacenamiento, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo del disco duro.
     *
     * @return El nombre del disco duro.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio del disco duro.
     *
     * @return El precio del disco duro en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca del disco duro.
     *
     * @return La marca del disco duro (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "Disco Duro".
     *
     * @return El tipo de componente (siempre "Disco Duro").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Proporciona una descripción completa del disco duro, que incluye el nombre,
     * la marca, la capacidad, el tipo de almacenamiento y el precio.
     *
     * @return Una cadena con la descripción detallada del disco duro.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoAlmacenamiento + " - Precio: $" + precio;
    }

    /**
     * Retorna la gama del disco duro (alta, media, baja).
     *
     * @return La gama del disco duro.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
