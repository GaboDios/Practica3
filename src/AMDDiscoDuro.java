/**
 * Clase que representa un disco duro AMD.
 * Implementa las interfaces DiscoDuro y Componente.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDDiscoDuro implements DiscoDuro, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Disco Duro";
    private int capacidad;
    private String tipoAlmacenamiento;
    private String gama;

    /**
     * Constructor para crear un disco duro AMD.
     *
     * @param nombre El nombre del disco duro.
     * @param precio El precio del disco duro.
     * @param marca La marca del disco duro.
     * @param capacidad La capacidad del disco duro.
     * @param tipoAlmacenamiento El tipo de almacenamiento (HDD o SSD).
     * @param gama El tipo de gama del disco duro.
     */
    public AMDDiscoDuro(String nombre, double precio, String marca, int capacidad, String tipoAlmacenamiento, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.gama = gama;
    }

    /**
     * Obtiene el nombre del disco duro.
     *
     * @return El nombre del disco duro.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del disco duro.
     *
     * @return El precio del disco duro.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca del disco duro.
     *
     * @return La marca del disco duro.
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
     * Obtiene una descripción del disco duro.
     *
     * @return Una cadena que decribe el disco duro.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoAlmacenamiento + " - Precio: $" + precio;
    }

    /**
     * Obtiene una descripción de la gama del disco duro.
     *
     * @return Una cadena que decribe la gama.
     */
    @Override
    public  String getGama(){
        return gama;
    }
}
