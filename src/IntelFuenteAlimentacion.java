/**
 * Clase que implementa la interfaz FuenteAlimentacion y Componente
 * para representar una fuente de alimentacion especifica de la marca Intel.
 * Proporciona informacion sobre el nombre, precio, marca, potencia y
 * eficiencia de la fuente.
 * 
 * @author Gabo, Pedro, Yamil, Isaac (Los Hijos de Korhal)
 */
public class IntelFuenteAlimentacion implements FuenteAlimentacion, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Fuente de Alimentación";
    private int potencia;
    private String eficiencia;  // 80 Plus, Gold, etc.

    /**
     * Constructor que inicializa una fuente de alimentacion con los detalles proporcionados.
     *
     * @param nombre el nombre de la fuente de alimentacion
     * @param precio el precio de la fuente de alimentacion
     * @param marca la marca de la fuente de alimentacion
     * @param potencia la potencia de la fuente de alimentacion
     * @param eficiencia la clasificacion de eficiencia de la fuente de alimentacion
     */
    public IntelFuenteAlimentacion(String nombre, double precio, String marca, int potencia, String eficiencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
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
        return nombre + " - " + marca + " - Potencia: " + potencia + "W - Eficiencia: " + eficiencia + " - Precio: $" + precio;
    }
}
