/**
 * Clase que representa una memoria RAM AMD.
 * Implementa las interfaces RAM y Componente.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDRAM implements RAM, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "RAM";
    private int capacidad; // Capacidad de RAM en GB
    private String tipoMemoria; // DDR4, DDR5, etc.

    /**
     * Constructor para crear una memoria RAM AMD.
     *
     * @param nombre El nombre de la memoria RAM.
     * @param precio El precio de la memoria RAM.
     * @param marca La marca de la memoria RAM.
     * @param capacidad La capacidad de la memoria RAM en GB.
     * @param tipoMemoria El tipo de memoria.
     */
    public AMDRAM(String nombre, double precio, String marca, int capacidad, String tipoMemoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoMemoria = tipoMemoria;
    }

    /**
     * Obtiene el nombre de la memoria RAM.
     * @return El nombre de la memoria RAM.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de la memoria RAM.
     * @return El precio de la memoria RAM.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca de la memoria RAM.
     *
     * @return La marca de la memoria RAM.
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
     * Obtiene una descripcion de la memoria RAM.
     * @return Una cadena con la descripcion de la memoria RAM.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoMemoria + " - Precio: $" + precio;
    }
}
