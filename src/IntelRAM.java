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

    /**
     * Constructor que inicializa un modulo de RAM con los detalles proporcionados.
     * @param nombre el nombre del modulo de RAM
     * @param precio el precio del modulo de RAM
     * @param marca la marca del modulo de RAM
     * @param capacidad la capacidad de RAM
     * @param tipoMemoria el tipo de memoria
     */
    public IntelRAM(String nombre, double precio, String marca, int capacidad, String tipoMemoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoMemoria = tipoMemoria;
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
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoMemoria + " - Precio: $" + precio;
    }
}

