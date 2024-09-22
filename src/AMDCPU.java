/**
 * Clase que representa un procesador AMD.
 * Implementa las interfaces CPU y Componente.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDCPU implements CPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "CPU";
    private String socket;
    private double frecuencia;  // Frecuencia específica de la CPU

     /**
     * Constructor para crear un procesador AMD
     * @param nombre El nombre del procesador
     * @param precio El precio del procesador
     * @param marca La marca del procesador
     * @param socket El tipo de socket del procesador
     * @param frecuencia La frecuencia del procesador
     */
    public AMDCPU(String nombre, double precio, String marca, String socket, double frecuencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.socket = socket;
        this.frecuencia = frecuencia;
    }

     /**
     * Obtiene el nombre del procesador.
     * @return El nombre del procesador.
     */

    @Override
    public String getNombre() {
        return nombre;
    }

     /**
     * Obtiene el precio del procesador.
     * @return El precio del procesador.
     */

    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca del procesador.
     * @return La marca del procesador.
     */

    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tipo de componente.
     * @return El tipo de componente.
     */

    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Obtiene el tipo de socket del procesador.
     * @return El tipo de socket.
     */

    @Override
    public String getSocketType() {
        return socket;
    }

    /**
     * Obtiene una descripción del procesador.
     * @return Una cadena que describe el procesador
     */

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Frecuencia: " + frecuencia + " GHz - Precio: $" + precio;
    }
}
