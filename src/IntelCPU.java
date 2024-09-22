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

    /**
     * Constructor que inicializa los atributos de la CPU Intel.
     * @param nombre El nombre del modelo de la CPU.
     * @param precio El precio de la CPU.
     * @param marca La marca de la CPU.
     * @param socket El tipo de socket de la CPU.
     * @param frecuencia La frecuencia de operacion de la CPU.
     */
    public IntelCPU(String nombre, double precio, String marca, String socket, double frecuencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.socket = socket;
        this.frecuencia = frecuencia;
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
    public String getSocketType() {
        return socket;
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Frecuencia: " + frecuencia + " GHz - Precio: $" + precio;
    }
}
