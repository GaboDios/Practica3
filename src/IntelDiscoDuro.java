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

    /**
     * Constructor que inicializa los atributos del disco duro Intel.
     * 
     * @param nombre El nombre del modelo del disco duro.
     * @param precio El precio del disco duro.
     * @param marca La marca del disco duro.
     * @param capacidad La capacidad del disco duro en GB.
     * @param tipoAlmacenamiento El tipo de almacenamiento del disco duro (HDD o SSD).
     */
    public IntelDiscoDuro(String nombre, double precio, String marca, int capacidad, String tipoAlmacenamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
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
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoAlmacenamiento + " - Precio: $" + precio;
    }
}
