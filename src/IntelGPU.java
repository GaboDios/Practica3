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
    private String puertosSalida;  // HDMI, DisplayPort, etc.

    /**
     * Constructor que inicializa una tarjeta grafica con los detalles proporcionados.
     *
     * @param nombre el nombre de la GPU
     * @param precio el precio de la GPU
     * @param marca la marca de la GPU
     * @param tipoMemoria el tipo de memoria de la GPu
     * @param puertosSalida los puertos de salida disponibles en la GPU
     */
    public IntelGPU(String nombre, double precio, String marca, String tipoMemoria, String puertosSalida) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipoMemoria = tipoMemoria;
        this.puertosSalida = puertosSalida;
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
        return nombre + " - " + marca + " - Tipo Memoria: " + tipoMemoria + " - Puertos: " + puertosSalida + " - Precio: $" + precio;
    }
}
