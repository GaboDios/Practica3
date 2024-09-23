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
    private String tipoComponente = "Fuente de Alimentacion";
    private int potencia;
    private String eficiencia;
    private String gama;

    /**
     * Constructor que inicializa una fuente de alimentacion con los detalles proporcionados.
     *
     * @param nombre el nombre de la fuente de alimentacion
     * @param precio el precio de la fuente de alimentacion
     * @param marca la marca de la fuente de alimentacion
     * @param potencia la potencia de la fuente de alimentacion
     * @param eficiencia la clasificacion de eficiencia de la fuente de alimentacion
     * @param gama la gama de la fuente de alimentación
     */
    public IntelFuenteAlimentacion(String nombre, double precio, String marca, int potencia, String eficiencia, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
        this.gama = gama;
    }

    /**
     * Retorna el nombre del modelo de la fuente de alimentación.
     *
     * @return El nombre de la fuente de alimentación.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la fuente de alimentación.
     *
     * @return El precio de la fuente de alimentación en dólares.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la fuente de alimentación.
     *
     * @return La marca de la fuente de alimentación (por ejemplo, Intel).
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, en este caso "Fuente de Alimentación".
     *
     * @return El tipo de componente (siempre "Fuente de Alimentación").
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Proporciona una descripción completa de la fuente de alimentación,
     * que incluye el nombre, la marca, la potencia, la eficiencia y el precio.
     *
     * @return Una cadena con la descripción detallada de la fuente de alimentación.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Potencia: " + potencia + "W - Eficiencia: " + eficiencia + " - Precio: $" + precio;
    }

    /**
     * Retorna la gama de la fuente de alimentación (alta, media, baja).
     *
     * @return La gama de la fuente de alimentación.
     */
    @Override
    public String getGama() {
        return gama;
    }
}
